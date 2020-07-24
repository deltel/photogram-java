package Photogram.restful.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Photogram.restful.repository.*;
import Photogram.restful.message.*;
import Photogram.restful.dto.*;

import javax.validation.Valid;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/photogram")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/api/auth/login")
    public Message login(@Valid @RequestBody Login login) {
        User u = userRepository.findByUsername(login.getUsername());
        if (u != null) {
            if (u.getPassword().equals(login.getPassword())) {
                String token = getJWTToken(login.getUsername());
                return new TokenMessage("User successfully logged in", token);
            }
        //Debugging purposes. 
        //Remove else statement upon completion 
        } else {
            return new Message("No such user in database"); 
        }
        
        return new Message("Invalid login credentials");
    }

    @PostMapping(path="/api/auth/logout")
    public Message logout() {
      return new Message("User successfully logged out");
    }

    private String getJWTToken(String username) {
        String secretKey = "ajssdneiopr9023rn";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");
                
        String token = Jwts
                    .builder()
                    .setId("photogramJWT")
                    .setSubject(username)
                    .claim("authorities",
						grantedAuthorities.stream()
							.map(GrantedAuthority::getAuthority)
							.collect(Collectors.toList()))
                    .setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis() + 600000))
                    .signWith(SignatureAlgorithm.HS512, 
                        secretKey.getBytes()).compact();

        return "Bearer " + token;

    }
}
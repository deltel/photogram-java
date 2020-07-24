package Photogram.restful;

//for storing uploaded files
import Photogram.restful.storage.StorageProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import Photogram.restful.security.JWTAuthorizationFilter;

@SpringBootApplication
/*
The next step is to enable the ConfigurationProperties feature by adding 
@EnableConfigurationProperties annotation to our main configuration class.
*/
@EnableConfigurationProperties(StorageProperties.class)
public class RestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), 
					UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, 
					"/photogram/api/auth/login", 
					"/photogram/api/users/register").permitAll()
				.antMatchers(HttpMethod.GET, 
					"/photogram/allUsers",
					"/photogram/api/posts").permitAll()
				.anyRequest().authenticated();
		}
	}

}

package Photogram.restful.forms;

import javax.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

public class UserForm {
    @NotNull
    private String firstname; 
    @NotNull
    private String lastname;
    @NotNull
    private String username; 
    @NotNull
    private String password; 
    @NotNull
    private String email;
    @NotNull
    private String location; 
    @NotNull
    private String biography;

    public UserForm() {}

    //getters
    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getLocation(){
        return this.location;
    }

    public String getBiography(){
        return this.biography;
    }

    //setters
    public void setUsername(String username){
        this.username = username;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setBiography(String bio){
        this.biography = bio;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
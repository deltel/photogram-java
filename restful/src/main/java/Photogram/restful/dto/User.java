package Photogram.restful.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //Tells Hibernate to make a table out of ths class
@Table(name = "users")
public class User {

    @Id //Specifies the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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
    @NotNull
    private String profile_photo; 
    @NotNull
    private String joined_on;

    public User() {}

    public User(String firstname, String lastname, String username, 
        String password, String email, String location, String biography, 
        String profile_photo, String joined_on){
            this.firstname = firstname;
            this.lastname = lastname;
            this.username = username;
            this.password = password;
            this.email = email;
            this.location = location;
            this.biography = biography;
            this.profile_photo = profile_photo;
            this.joined_on = joined_on;
    }

    public Integer getID(){
        return this.id;
    }
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

    public String getProfile_photo(){
        return this.profile_photo;
    }

    public String getJoined_on(){
        return this.joined_on;
    }

    public void setId(Integer id){
        this.id = id;
    }

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

    public void setProfile_photo(String photo){
        this.profile_photo = photo;
    }

    public void setJoined_on(String date){
        this.joined_on = date;
    }
}
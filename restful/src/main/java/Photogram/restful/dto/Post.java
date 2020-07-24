package Photogram.restful.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //Tells Hibernate to generate a table 
@Table(name = "posts")
public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Integer userId;
    @NotNull
    private String photo;
    @NotNull
    private String caption;
    @NotNull
    private String created_on;

    //constructors
    public Post() {}

    public Post(String userId, String photo, String caption, String created_on){
        this.userId = Integer.parseInt(userId);
        this.photo = photo;
        this.caption = caption;
        this.created_on = created_on;
    }

    public Integer getID(){
        return this.id;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public String getPhoto(){
        return this.photo;
    }

    public String getCaption(){
        return this.caption;
    }

    public String getCreated_on(){
        return this.created_on;
    }

    public void setId(Integer id){
        this.id =id;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setPhoto(String photo){
        this.photo = photo;
    }

    public void setCaption(String caption){
        this.caption = caption;
    }

    public void setCreated_on(String created){
        this.created_on = created;
    }
}
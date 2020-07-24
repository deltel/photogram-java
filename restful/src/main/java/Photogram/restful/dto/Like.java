package Photogram.restful.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //Tells Hibernate to generate a table
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Integer userId;
    @NotNull
    private Integer postId;

    //Constructors
    public Like() {}

    public Like(String userId, String postId){
        this.userId = Integer.parseInt(userId);
        this.postId = Integer.parseInt(postId);
    }

    public Integer getID(){
        return this.id;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public Integer getPostId(){
        return this.postId;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setPostId(Integer postId){
        this.postId = postId;
    }
}
package Photogram.restful.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //Tells Hibernate to generate a table
@Table(name = "follows")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Integer userId;
    @NotNull
    private Integer followerId;

    public Follow() {}
 
    public Follow(String userId, String followerId){
        this.userId = Integer.parseInt(userId);
        this.followerId = Integer.parseInt(followerId);
    }

    public Integer getId(){
        return this.id;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public Integer getFollowerId(){
        return this.followerId;
    }

    //SETTERS

    public void setId(Integer id){
        this.id = id;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setFollowerId(Integer followerId){
        this.followerId = followerId;
    }
}
package Photogram.restful.dto;

public class FollowCount {
    private Integer followers = 0;

    public FollowCount(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowers() {
        return this.followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }
}
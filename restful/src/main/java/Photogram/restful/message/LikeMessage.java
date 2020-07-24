package Photogram.restful.message;

public class LikeMessage extends Message {
    private Integer likes = 0;

    public LikeMessage(String message, Integer likes) {
        super(message);
        this.likes = likes;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
package Photogram.restful.message;

public class TokenMessage extends Message{
    private String token;

    public TokenMessage(String message, String token) {
        super(message);
        this.token = token;
    }

    public String getToken(){
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
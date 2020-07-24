package Photogram.restful.dto;

import javax.validation.constraints.NotBlank;

public class Login {

    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public Login() {}

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
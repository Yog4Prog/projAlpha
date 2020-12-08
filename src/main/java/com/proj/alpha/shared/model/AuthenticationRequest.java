package com.proj.alpha.shared.model;

public class AuthenticationRequest {

    private String userName;
    private String password;

    public AuthenticationRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public AuthenticationRequest() {
    }

    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "userName='" + this.userName + '\'' +
                ", password='" + this.password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

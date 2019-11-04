package com.vetdocchat.NotificationManager;

/**
 * Created by Admin on 9/2/2019.
 */

public class Token {
    private String UserToken;

    public Token() {
    }

    public Token(String token) {
        this.UserToken = token;
    }

    public String getToken() {
        return UserToken;
    }

    public void setToken(String token) {
        this.UserToken = token;
    }
}

package com.adrian.model;

/**
 * Created by adri4n on 20.09.2016.
 */
public class User {

    private long idUser;
    private String username;
    private String email;

    public User() {

    }

    public User(long idUser, String username, String email) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

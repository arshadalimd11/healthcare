package com.dxctraining.usermgt.dto;

public class AddUserRequestData {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String role;

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
}

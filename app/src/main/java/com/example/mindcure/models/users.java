package com.example.mindcure.models;

public class users  {
    String profilePic, username, mail, password, userid, lastMessage;

    public users(String profilePic, String username, String mail, String password, String userid, String lastMessage) {
        this.profilePic = profilePic;
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.userid = userid;
        this.lastMessage = lastMessage;
    }

    public users() {
    }

    //sign up constructor

    public users(String username, String mail, String password) {

        this.username = username;
        this.mail = mail;
        this.password = password;
        this.userid = userid;


    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}


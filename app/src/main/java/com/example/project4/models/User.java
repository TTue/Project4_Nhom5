package com.example.project4.models;

import android.media.Image;

import java.io.Serializable;

public class User implements Serializable {
    private int userID;
    private int userAge;
    private String userName;
    private String userAddress;
    private Image userImage;
    private Boolean userStatusMatch;
    private Boolean userStatusOnline;
    private String userEmail;
    private String userPassword;
    public User() {
    }

    public User(int userID, int userAge, String userName, String userAddress, Image userImage, Boolean userStatusMatch, Boolean userStatusOnline) {
        this.userID = userID;
        this.userAge = userAge;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userImage = userImage;
        this.userStatusMatch = userStatusMatch;
        this.userStatusOnline = userStatusOnline;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Image getUserImage() {
        return userImage;
    }

    public void setUserImage(Image userImage) {
        this.userImage = userImage;
    }

    public Boolean getUserStatusMatch() {
        return userStatusMatch;
    }

    public void setUserStatusMatch(Boolean userStatusMatch) {
        this.userStatusMatch = userStatusMatch;
    }

    public Boolean getUserStatusOnline() {
        return userStatusOnline;
    }

    public void setUserStatusOnline(Boolean userStatusOnline) {
        this.userStatusOnline = userStatusOnline;
    }
}

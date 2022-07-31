package com.example.project4.models;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private int ID;
    private int userID;
    private int idUserReceive;
    private String content;
    private Date date;

    public Message() {
    }

    public Message(int ID, int userID, int idUserReceive, String content, Date date) {
        this.ID = ID;
        this.userID = userID;
        this.idUserReceive = idUserReceive;
        this.content = content;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getIdUserReceive() {
        return idUserReceive;
    }

    public void setIdUserReceive(int idUserReceive) {
        this.idUserReceive = idUserReceive;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

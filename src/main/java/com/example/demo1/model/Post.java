package com.example.demo1.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes = 0;
    private Date creationDate;

    public Post(String text, Date creationDate, Integer likes){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }
}

package com.example.demo1.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes = 0;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate, Integer likes){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = likes;
    }

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }

    public Long getId(){
        return id;
    }
}

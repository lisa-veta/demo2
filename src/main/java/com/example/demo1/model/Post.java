package com.example.demo1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

import java.util.Date;
@Entity
public class Post {
    String text;
    Integer likes = 0;
    private Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public Post() {  }

    public Post(Long id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
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

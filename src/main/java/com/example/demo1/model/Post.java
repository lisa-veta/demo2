package com.example.demo1.model;

public class Post {
    String text;
    Integer likes = 0;

    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
    }

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
}

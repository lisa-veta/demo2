package com.example.demo1.service;

import com.example.demo1.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;
    {
        posts = new ArrayList<>();
        posts.add(new Post(0L, "пост 1", new Date(), 0));
        posts.add(new Post(1L,"пост 2", new Date(), 0));
        posts.add(new Post(2L,"пост 3", new Date(), 0));
    }

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text){
        Long id = (long)posts.size();
        posts.add(new Post(id, text, new Date(), 0));
    }
}

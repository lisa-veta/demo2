package com.example.demo1.service;

import com.example.demo1.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList(){
            {
                add(new Post("post1", 0));
                add(new Post("post2", 2));
                add(new Post("post3", 1));
            }
        };
        return list;
    }
}

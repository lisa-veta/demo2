package com.example.demo1.service;

import com.example.demo1.model.Post;
import com.example.demo1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(final String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}

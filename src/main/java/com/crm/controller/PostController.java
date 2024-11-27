package com.crm.controller;

import com.crm.entity.Posts;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostsRepository postsRepository;
    private CommentRepository commentRep;

    public PostController(PostsRepository postsRepository, CommentRepository commentRepository) {
        this.postsRepository = postsRepository;
        this.commentRep = commentRep;
    }

    @PostMapping
    public String createPost(
            @RequestBody Posts post
    ) {
        postsRepository.save(post);
        return null;
    }

    @DeleteMapping
    public void deletePost(){
        postsRepository.deleteById(1L);
    }
}
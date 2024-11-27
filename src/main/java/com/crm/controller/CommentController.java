package com.crm.controller;

import com.crm.entity.Comment;
import com.crm.entity.Posts;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {
    private PostsRepository postsRepository;
    private CommentRepository commentRepository;

    public CommentController(PostsRepository postsRepository, CommentRepository commentRepository) {
        this.postsRepository = postsRepository;
        this.commentRepository = commentRepository;
    }

    @PostMapping
    public String createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
    ){
        Posts post = postsRepository.findById(postId).get();
        comment.setPosts(post);

        commentRepository.save(comment);

        return "Comment created successfully";
    }
}

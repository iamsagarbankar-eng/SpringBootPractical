package com.example.securityapplication.services;

import com.example.securityapplication.dto.PostDto;

import java.util.List;


public interface PostService {

    List<PostDto> getAllPosts();
    PostDto createNewPost(PostDto inputPost);

    PostDto getPostById(Long postId);
}

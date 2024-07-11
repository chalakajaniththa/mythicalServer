package com.mythicalRose.mythicalServer.service;

import com.mythicalRose.mythicalServer.entity.Post;

import java.util.List;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);
}

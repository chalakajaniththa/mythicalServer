package com.mythicalRose.mythicalServer.service;

import com.mythicalRose.mythicalServer.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentsByPostId(Long postId);
}

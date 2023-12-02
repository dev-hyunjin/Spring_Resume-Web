package com.example.resume_web.repository;

import com.example.resume_web.entity.Post;
import com.querydsl.core.Tuple;

import java.util.List;
import java.util.Optional;

public interface PostQueryDSL {

   public List<Post> findAllByPostId(Long postId);

//    public Optional<Post> findPostDetailsByPostId(Long postId);
}

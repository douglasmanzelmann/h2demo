package com.douglas.service;

import com.douglas.domain.Post;
import com.douglas.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by douglas manzelmann on 4/20/2016.
 */

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatestPost() {
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> list() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    public Post getBySlug(String slug) {
        return postRepository.findBySlug(slug);
    }
}

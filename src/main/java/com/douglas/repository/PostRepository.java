package com.douglas.repository;

import com.douglas.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by douglas manzelmann on 4/19/2016.
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);
}

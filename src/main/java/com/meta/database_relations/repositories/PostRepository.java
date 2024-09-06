package com.meta.database_relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meta.database_relations.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

package com.meta.database_relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meta.database_relations.model.Group;

@Repository
public interface SocialGroupRepository extends JpaRepository<Group, Long> {

}

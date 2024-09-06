package com.meta.database_relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meta.database_relations.model.SocialUser;

@Repository
public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {

}

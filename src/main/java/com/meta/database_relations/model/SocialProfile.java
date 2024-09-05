package com.meta.database_relations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // in mapped by we pass variable name of other joined table
    // mapped by will be used in non owner table
    @OneToOne(mappedBy = "profile")
    // @JoinColumn(name = "userKey")
    private SocialUser user;
}

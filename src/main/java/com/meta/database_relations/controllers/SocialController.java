package com.meta.database_relations.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meta.database_relations.model.SocialUser;
import com.meta.database_relations.services.SocialService;

@RestController
public class SocialController {
    @Autowired
    private SocialService socialService;

    @GetMapping("/posts")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return socialService.getUsers();
    }
}

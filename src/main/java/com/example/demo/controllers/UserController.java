package com.example.demo.controllers;

import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.outs.DiaryDto;
import com.example.demo.services.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}/diaries")
    public ResponseEntity<ResponseDetail<List<DiaryDto>>> findById(@PathVariable int id){
        return userService.readDiaryByUser(id);
    }
}

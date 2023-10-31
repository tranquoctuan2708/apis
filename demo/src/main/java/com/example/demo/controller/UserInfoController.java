package com.example.demo.controller;

import com.example.demo.model.UserInfomation;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserInfoController {

    @Autowired
    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/user-info")
    public List<UserInfomation> findAll() {
        return userInfoService.findAll();
    }

    @GetMapping("/user-info/{id}")
    public Optional<UserInfomation> findUserInfoById(@PathVariable Integer id) {
        return userInfoService.findUserInfoById(id);
    }
}

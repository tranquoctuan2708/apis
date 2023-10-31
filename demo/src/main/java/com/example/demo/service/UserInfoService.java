package com.example.demo.service;

import com.example.demo.model.UserInfomation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserInfoService {
    List<UserInfomation> findAll();
    Optional<UserInfomation> findUserInfoById(Integer id);
}

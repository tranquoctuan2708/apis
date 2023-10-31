package com.example.demo.service;

import com.example.demo.model.UserInfomation;
import com.example.demo.repository.UserInfoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    private UserInfoRepository userInfoRepository;

    public UserInfoServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public List<UserInfomation> findAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public Optional<UserInfomation> findUserInfoById(Integer id) {
        return userInfoRepository.findUserInfoById(id);
    }
}

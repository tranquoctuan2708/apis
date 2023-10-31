package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByUserId(Integer id) {
        return userRepository.findById(id);
    }
}

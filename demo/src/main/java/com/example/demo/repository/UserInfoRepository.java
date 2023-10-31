package com.example.demo.repository;

import com.example.demo.model.UserInfomation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfomation, Integer> {
    List<UserInfomation> findAll();

    Optional<UserInfomation> findUserInfoById(Integer id);
}

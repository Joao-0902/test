package com.example.logiqueapi.repository;

import com.example.logiqueapi.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    public UserModel findByName(String name);
}
package com.example.studentcrud.service;

import com.example.studentcrud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    List<User> getAllUsers();
    long getUserCount();
    User getUserById(Long id);
    void deleteUser(Long id);
}

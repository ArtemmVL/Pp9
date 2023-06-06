package com.example.crudspringboot.service;

import com.example.crudspringboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User user);

    User getUserById(Long id);

}

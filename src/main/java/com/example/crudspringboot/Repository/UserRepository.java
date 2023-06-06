package com.example.crudspringboot.Repository;

import com.example.crudspringboot.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUserById(Long id);

}

package com.example.crudspringboot.service;

import com.example.crudspringboot.Repository.UserRepository;
import com.example.crudspringboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User user) {
        userRepository.updateUser(user);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }


}

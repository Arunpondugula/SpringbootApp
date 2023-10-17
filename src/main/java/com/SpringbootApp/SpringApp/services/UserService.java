package com.SpringbootApp.SpringApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootApp.SpringApp.repositories.userRepository;
import com.SpringbootApp.SpringApp.userdetails.Users;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final userRepository userRepository;

    @Autowired
    public UserService(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Users updateUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

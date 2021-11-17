package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.repository.UserRepository;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;

    public List<User> listAll() {
        return userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public Optional<User> get(long id) {
        return userRepository.findById(id);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}

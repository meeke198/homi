package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.User;
import com.example.shoppingcart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepository userRepository;

    public Optional<User> getUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()){
            return user;
        } else {
            return Optional.empty();
        }

    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

}

package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.User;
import com.example.shoppingcart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserImpl {
    private final UserRepository userRepository;

    Optional<User> getUser(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user;
        } else {
            return Optional.empty();
        }

    }

}

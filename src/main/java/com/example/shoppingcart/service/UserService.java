package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.User;
import com.example.shoppingcart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;


public interface UserService {
User saveUser(User user);
//void softDeleteUser(Long id);
    Optional<User> getUser(Long userId);
//    Optional<Collection<User>> getUsers();

}

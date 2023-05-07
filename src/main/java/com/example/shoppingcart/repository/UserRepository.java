package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

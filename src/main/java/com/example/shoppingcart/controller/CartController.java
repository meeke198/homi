package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class CartController {
    @Autowired
    private CartRepository cartRepository;
    @GetMapping("/")
    public ResponseEntity <List<Cart>> getCart() {
        return ResponseEntity.ok().body(cartRepository.findAll());
    }
}

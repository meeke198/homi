package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;

import java.util.List;
import java.util.Optional;


public interface CartService {

    List<Cart> findAll();
    Optional<Cart> getCartById(Long id);
    Cart addToCart(Cart cart);
    void deleteCartById(Long id);
}

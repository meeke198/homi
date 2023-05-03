package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;

import java.util.Set;
import java.util.Optional;


public interface CartService {

    Cart createCart(Set<Product> products);
    Optional<Cart> getCart(Long id);
    Cart editCart(Cart cart);
    void deleteCArtById(Long id);
}

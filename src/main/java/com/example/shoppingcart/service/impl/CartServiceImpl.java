package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.repository.CartRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartReepo;


    @Override
    public Cart createCart(Set<Product> products) {
        return null;
    }

    @Override
    public Optional<Cart> getCart(Long id) {
        return Optional.empty();
    }

    @Override
    public Cart editCart(Cart cart) {
        return null;
    }

    @Override
    public void deleteCArtById(Long id) {

    }
}

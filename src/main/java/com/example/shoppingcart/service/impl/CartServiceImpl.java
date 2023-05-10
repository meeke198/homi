package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.repository.CartRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor //generate a constructor for a class that takes in all final fields as arguments.
@Transactional //tells Spring to manage the transaction(a sequence of database operations that are
// executed as a single unit of work) for you
@Slf4j
public class CartServiceImpl implements CartService {
    @Autowired
    private final CartRepository cartRepo;
    @Override
    public Cart addToCart(Cart cart) {
        log.info("Creating new cart");
        Cart newCart = cartRepo.save(cart);
        return newCart;
    }

    @Override
    public List<Cart> findAll() {
        return cartRepo.findAll();
    }

    @Override
    public Optional<Cart> getCartById(Long id) {
        Optional<Cart> cart = cartRepo.findById(id);
        if(cart.isPresent()){
            return cart;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteCartById(Long id) {
        log.info("Removing cart ");
        cartRepo.deleteById(id);
    }
}

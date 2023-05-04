package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping("")
    public ResponseEntity <List<Cart>> getCarts() {
        return ResponseEntity.ok().body(cartService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cart>> getCart(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(cartService.getCartById(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<Cart>> deleteCart(@PathVariable("id") Long id){
        Optional<Cart> cart = cartService.getCartById(id);
        if(cart.isPresent()){
            cartService.deleteCartById(id);
            return ResponseEntity.ok().body(cart);
        } else {

            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/create")
    public ResponseEntity<Cart> saveCart(@RequestBody Cart cart){
        return ResponseEntity.ok().body(cartService.saveCart(cart));
    }
}

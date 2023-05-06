package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.CartProduct;
import com.example.shoppingcart.service.impl.CartProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cartProducts")
public class CartProductController {
    private final CartProductServiceImpl cartProductService;

    @GetMapping("")
    public ResponseEntity<Optional<List<CartProduct>>> showCartProducts(Long cartId){
        if(cartId != null){
            return ResponseEntity.ok().body(cartProductService.findCartProductByCartId(cartId));
        } else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public void deleteCartItem(Long cartProductId){
        cartProductService.removeCartProduct(cartProductId);
    }
}

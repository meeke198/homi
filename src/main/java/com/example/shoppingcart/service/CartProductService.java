package com.example.shoppingcart.service;
import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.CartProduct;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.impl.CartProductImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public interface CartProductService {
    CartProduct saveCartProduct(CartProduct cartProduct);
    Optional<Map<Long,CartProduct>> findAllProducts(Long cartId);
    void removeProduct(Long id);

}

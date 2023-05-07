package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
//import java.util.Set;

public interface ProductService {
    Optional<List<Product>> getAll();
    Optional<Product> getProduct(Long id);
//    Cart addToCart(Long cartId, Long productId);
    Product saveProduct(Product product);
    void deleteProductById(Long id);
    Optional<List<Product>> findProductByName(String name);

}

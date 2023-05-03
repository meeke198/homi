package com.example.shoppingcart.service;

import com.example.shoppingcart.entity.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {
    List<Product> getAll();
    void addToCart(Long id);
    void saveProduct(Product product);
    void deleteProductById(Long id);

}

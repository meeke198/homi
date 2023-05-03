package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.repository.ProductRepo;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void addToCart(Long id) {

    }

    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public void deleteProductById(Long id) {

    }
}

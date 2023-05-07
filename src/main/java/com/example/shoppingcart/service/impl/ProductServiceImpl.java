package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.repository.CartRepository;
import com.example.shoppingcart.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.repository.ProductRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor //generate a constructor for a class that takes in all final fields as arguments.
@Transactional //tells Spring to manage the transaction(a sequence of database operations that are
// executed as a single unit of work) for you
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductRepo productRepo;
    @Autowired
    private final CartRepository cartRepository;

    @Override
    public Optional<List<Product>> getAll() {
        log.info("Getting product list");
        Optional<List<Product>> productList = Optional.of(productRepo.findAll());
        return productList;
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        log.info("Fetching product");
        Optional<Product> product = productRepo.findById(id);
        if(product.isPresent()){
            return product;
        } else {
            return Optional.empty();
        }

    }

//    @Override
//    public Cart addToCart(Long cartId, Long productId) {
//        Optional<Cart> cart = cartRepository.findById(cartId);
//        Optional<Product> product = productRepo.findById(productId);
//        if(cart.isPresent()){
//            List<Product> productList = cart.get().getProducts();
//                for (int i = 0; i < productList.size(); i++) {
//                    if (productList.get(i).getId().equals(product.get().getId())) {
//                        productList.get(i).setQuantity(productList.get(i).getQuantity() + 1);
//                        return cart.get();
//                    }
//                }
//                productList.add(product.get());
//
//        }else{
//            Cart newCart = cartRepository.save(new Cart());
//            newCart.getProducts().add(product.get());
//            return newCart;
//        }
//        return cart.get();
//    }

    @Override
    public Product saveProduct(Product product) {
        log.info("Saving new product");
        Product newProduct = productRepo.save(product);
        return newProduct;
    }

    @Override
    public void deleteProductById(Long id) {
        log.info("Deleting product");
        productRepo.deleteById(id);
    }

    @Override
    public Optional<List<Product>> findProductByName(String name){
        Optional<List<Product>> productList = productRepo.findProductByName(name);
        if(productList.isPresent()){
            return productList;
        } else{
            return Optional.empty();
        }
    }
}

package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    @GetMapping("")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok().body(productService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(productService.getProduct(id));
    }
    @GetMapping("/search/{name}")
    public ResponseEntity<Optional<List<Product>>> getAllProducts(@PathVariable("name") String name){
        return ResponseEntity.ok().body(productService.findProductByName(name));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<Product>> deleteProduct(@PathVariable("id") Long id){
        Optional<Product> product = productService.getProduct(id);
        if(product.isPresent()){
            productService.deleteProductById(id);
            return ResponseEntity.ok().body(product);
        } else {

            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/create")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.saveProduct(product));
    }

//   @PostMapping("/addToCart")
//    public ResponseEntity<Cart> addProductToCart(@PathVariable Long productId, @PathVariable Long cartId){
//        return ResponseEntity.ok().body(productService.addToCart(productId, cartId));
//  }
}

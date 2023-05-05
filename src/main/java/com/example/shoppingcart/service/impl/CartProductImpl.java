package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.entity.CartProduct;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.repository.CartProductRepo;
import com.example.shoppingcart.service.CartProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CartProductImpl implements CartProductService {
    private final CartProductRepo cartProductRepo;


    @Override
    public CartProduct saveCartProduct(CartProduct cartProduct) {
        return cartProductRepo.save(cartProduct);
    }

    @Override
    public Optional<Map<Long,CartProduct>> findAllProducts(Long cartId) {
        Optional<List<CartProduct>> cartProductList = cartProductRepo.findAllProducts(cartId);
        Optional<Map<Long,CartProduct>> productMap = Optional.of(new HashMap<Long, CartProduct>());
        if(cartProductList.isPresent()){
            Iterator<List<CartProduct>> cartProductIterator = cartProductList.stream().iterator();

            while (cartProductIterator.hasNext()){
                CartProduct cartProduct = (CartProduct) cartProductIterator.next();
                Long cartProductId = cartProduct.getCart().getId();
                if(productMap.get().containsKey(cartProductId)){
                    CartProduct cartProductMap = productMap.get().get(cartProductId);
                    cartProductMap.setQuantity(cartProductMap.getQuantity() + cartProduct.getQuantity());
                } else {
                    productMap.get().put(cartProductId, cartProduct);
                }
            }
                return productMap;
        } else {
            return Optional.empty();
        }

    }

    @Override
    public void removeProduct(Long id) {

    }
}

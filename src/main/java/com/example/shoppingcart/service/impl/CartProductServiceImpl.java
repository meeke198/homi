//package com.example.shoppingcart.service.impl;
//
//import com.example.shoppingcart.entity.CartProduct;
//import com.example.shoppingcart.repository.CartProductRepo;
//import com.example.shoppingcart.service.CartProductService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//@RequiredArgsConstructor
//public class CartProductServiceImpl implements CartProductService {
//    private final CartProductRepo cartProductRepo;
//
//
//    @Override
//    public CartProduct saveCartProduct(CartProduct cartProduct) {
//        return cartProductRepo.save(cartProduct);
//    }
//
//
//    @Override
//    public void addCartProduct(Long cartProductId, Long cartId) {
//        Optional<List<CartProduct>> cartProductList = cartProductRepo.findCartProductByCartId(cartId);
//        Optional<CartProduct> cartProduct = cartProductRepo.findById(cartProductId);
//        if(cartProduct.isPresent()){
//            Iterator<List<CartProduct>> cartProductIterator = cartProductList.stream().iterator();
//
//            while (cartProductIterator.hasNext()){
//                CartProduct cartProductIteratorItem = (CartProduct) cartProductIterator.next();
////                Long cartProductId = cartProduct.getCart().getId();
//                if(cartProductIteratorItem.getId() == cartProduct.get().getId()){
//                    cartProductIteratorItem.setQuantity(cartProductIteratorItem.getQuantity() + cartProduct.get().getQuantity());
//                    return;
////                    break;
//                }
//            }
//         cartProductList.get().add(cartProduct.get());
//        }
//    }
//
//    @Override
//    public Optional<List<CartProduct>> findCartProductByCartId(Long cartId) {
//        return cartProductRepo.findCartProductByCartId(cartId);
//    }
//
//    @Override
//    public void removeCartProduct(Long cartProductId) {
//        cartProductRepo.deleteById(cartProductId);
//    }
//}

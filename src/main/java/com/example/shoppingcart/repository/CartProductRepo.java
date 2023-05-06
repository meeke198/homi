package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.CartProduct;
import com.example.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Long> {
    @Query(value = "SELECT cp FROM CartProduct cp WHERE cp.cart_id = :cartId")
    Optional<List<CartProduct>> findCartProductByCartId(@Param("cartId") Long cartId);
}

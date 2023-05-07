//package com.example.shoppingcart.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class CartProduct {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//    @ManyToOne(targetEntity = Product.class, fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    private Product product;
//    @ManyToOne(targetEntity = Cart.class, fetch = FetchType.LAZY)
//    @JoinColumn(name = "cart_id", referencedColumnName = "id")
//    private Cart cart;
//    private Integer quantity;
//
//
//}

package com.example.shoppingcart.entity;
import lombok.*;
import javax.persistence.*;

import com.example.shoppingcart.entity.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table 
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Cart(Set<Product> products){
        this.products = products;
    };

    // @OneToMany(targetEntity = Product.class ) // mappedBy="Cart"
    // @JoinColumn(name = "cart_id")
    @ManyToMany(targetEntity = Product.class)
    @JoinTable(name = "cart_products", //ten bang phu
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;
    
}
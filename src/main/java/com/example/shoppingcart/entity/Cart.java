package com.example.shoppingcart.entity;
import lombok.*;
import javax.persistence.*;

import com.example.shoppingcart.entity.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
//import java.util.Set;


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

    @ManyToMany(targetEntity = Product.class, fetch = FetchType.EAGER)
    @JoinTable(name = "cart_products", //ten bang phu
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<>();
}
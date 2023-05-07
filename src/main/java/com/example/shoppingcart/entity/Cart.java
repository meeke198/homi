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
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "proudct")
    private Collection<Product> products;
}
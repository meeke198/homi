package com.example.shoppingcart.entity;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table

public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
   @Column(name = "name", nullable = false)
   private String name;
   @Column(name = "price", nullable = false)
   private Float price;
   @Column(name = "quantity", nullable = false)
   private Integer quantity;
   @Column(name = "description", nullable = false)
   private String description;
   @Column(name = "urlImage", nullable = false)
   private String urlImage;
}

package com.example.shoppingcart.entity;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


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
   @Column(name = "quantity", columnDefinition = "INT DEFAULT '0'")
   private Integer quantity;
   @Column(name = "description")
   private String description;
   @Column(name = "urlImage")
   private String urlImage;
}

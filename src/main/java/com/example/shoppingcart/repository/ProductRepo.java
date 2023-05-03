package com.example.shoppingcart.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.shoppingcart.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    //@Query("SELECT s FROM Student s WHERE s.email = ?1")
    @Query(value="from Product p WHERE p.name LIKE %:name% OR p.description LIKE %:name%")
    Product findProductByName(@Param("name") String name);
    // Optional<Product> findProductByName(String name);
    
}

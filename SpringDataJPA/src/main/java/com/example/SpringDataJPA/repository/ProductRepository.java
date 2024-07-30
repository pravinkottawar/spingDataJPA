package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByDescription(String description);
}

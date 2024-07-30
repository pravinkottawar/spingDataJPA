package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        Product product = new Product();
        product.setName("Hari");
        product.setSku("1");

        Product savedProduct = productRepository.save(product);

        System.out.println(savedProduct.getId());
        System.out.println(savedProduct.toString());
    }
    @Test
    void updateSaveMethod(){

        Long id = 1L;
        Product product = productRepository.findById(id).get();

        product.setDescription("Hai Hari");

        productRepository.save(product);

        Product product1 = productRepository.findByDescription("Hari").get();
    }
}
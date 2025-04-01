package com.example.Crud_SpringBoot.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Crud_SpringBoot.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository <ProductModel, Integer> {
    
}

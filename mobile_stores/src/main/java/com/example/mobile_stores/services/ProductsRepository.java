package com.example.mobile_stores.services;

import com.example.mobile_stores.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {


}

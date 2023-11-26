package com.omegacorp.zicommerce.repositories;

import com.omegacorp.zicommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

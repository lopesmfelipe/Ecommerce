package com.omegacorp.zicommerce.controllers;

import com.omegacorp.zicommerce.dto.ProductDTO;
import com.omegacorp.zicommerce.entities.Product;
import com.omegacorp.zicommerce.repositories.ProductRepository;
import com.omegacorp.zicommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}

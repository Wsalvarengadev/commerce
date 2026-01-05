package com.wsdev.commerce.services;

import com.wsdev.commerce.dto.ProductDTO;
import com.wsdev.commerce.entities.Product;
import com.wsdev.commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        //Optional<Product> result = repository.findById(id);
        Product product = repository.findById(id).get();
        return new  ProductDTO(product);
    }
}

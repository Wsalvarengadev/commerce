package com.wsdev.commerce.repositories;

//Responsável por operações com o banco de dados referente a produtos


import com.wsdev.commerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

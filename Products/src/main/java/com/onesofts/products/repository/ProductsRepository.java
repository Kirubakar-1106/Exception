package com.onesofts.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesofts.products.entity.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer> {

}

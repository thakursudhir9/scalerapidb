package com.example.scalerapidb.repositories;

import com.example.scalerapidb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}

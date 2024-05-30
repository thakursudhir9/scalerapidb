package com.example.scalerapidb.repositories;

import com.example.scalerapidb.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

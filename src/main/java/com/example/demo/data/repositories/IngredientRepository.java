package com.example.demo.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entities.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long>{

}

package com.example.demo.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}

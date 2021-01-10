package com.example.demo.data.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Recipe {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String description;

private LocalTime preptime; 

private LocalTime cooktime;

private Integer servings;

@Enumerated(EnumType.STRING)
private Difficulty  difficulty;
@Lob
private String directions;

@OneToMany(mappedBy = "recipe")
List<Ingredient> ingredients;

}

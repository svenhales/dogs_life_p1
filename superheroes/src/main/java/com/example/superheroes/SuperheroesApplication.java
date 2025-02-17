package com.example.superheroes;

import com.example.superheroes.Service.HeroService;
import com.example.superheroes.model.Hero;
import com.example.superheroes.practice.Calculator;
import com.example.superheroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SuperheroesApplication {


	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}

}

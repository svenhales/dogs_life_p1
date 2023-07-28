package com.example.superheroes.controller;

import com.example.superheroes.model.Hero;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HeroController {
    @Autowired
    HeroService heroService;
    @GetMapping("/heroes")
    public List<Hero> getAllHeroes(){
        return heroService.getAllHeroes();
    }

}

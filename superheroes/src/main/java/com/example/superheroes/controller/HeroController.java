package com.example.superheroes.controller;

import com.example.superheroes.Service.HeroService;
import com.example.superheroes.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroController {
    @Autowired
    HeroService heroService;

    /*public List<Hero> getAllHeroes(){
        return heroService.getAllHeroes();
    }*/

    @GetMapping("/heroes")
    public List<Hero> getAllHeroes(){
        return heroService.getAllHeroes();
    }

    @GetMapping("/heroes/{letter}")
    public List<Hero> getHeroesStartingWithLetter(@PathVariable String letter){
        return heroService.getHeroesStartingWithLetter(letter);
    }
    @PostMapping("/heroes")
    public HttpStatus saveNewHero(@RequestBody Hero hero){
        Hero result = heroService.saveHero(hero);
        if (result == null){
            return HttpStatus.PRECONDITION_FAILED;
        }else{
            return HttpStatus.CREATED;
        }
    }
}


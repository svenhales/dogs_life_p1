package com.example.superheroes.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
//The instantiation of this class will be use later on main class
public class Calculator {
    public int addition(int num1, int num2){
        return num1 + num2;
    }

    @PostConstruct
    public void init(){
        System.out.println("Calculator created!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Calculator destroyed");
    }

}

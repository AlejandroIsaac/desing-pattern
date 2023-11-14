package com.company.capdos.patterndesing.builder;

import java.util.List;

public class Animal {
    private String name;
    private int age;
    private List<String> FavoriteFoods;

    public Animal(String name, int age, List<String> favoriteFoods){
        this.name= name;
        this.age = age;
        this.FavoriteFoods = favoriteFoods;
    }
}

package com.company.capdos.patterndesing.builder;

import java.util.List;

public class AnimalBuilder {
    private String name;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setName(String name) {
        this.name= name;
        return this;
    }
    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods){
        this.favoriteFoods =favoriteFoods;
        return this;
    }

    public Animal build(){
        return new Animal(name,age,favoriteFoods);
    }
}

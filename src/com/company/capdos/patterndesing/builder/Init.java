package com.company.capdos.patterndesing.builder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Init {
    public static void main(String[] args) {
        Animal perro = new AnimalBuilder()
                //.setName("Chato")
                .setAge(1)
                .setFavoriteFoods(Arrays.asList("carne", "croquetas"))
                .build();
    }
}

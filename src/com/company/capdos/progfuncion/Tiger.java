package com.company.capdos.progfuncion;

public class Tiger implements Sprint{
    @Override
    public void Sprint(Animal animal) {
        System.out.println("Animal runnig fast: " + animal.toString());
    }
}

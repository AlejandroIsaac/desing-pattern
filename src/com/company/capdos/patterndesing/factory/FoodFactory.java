package com.company.capdos.patterndesing.factory;

public class FoodFactory {
    public static Food getFoot(String animal){
        switch (animal){
            case ("zebra"):
                return new Hay(100);
            case ("rabbit"):
                return new Pallets(5);
            case ("polar bear"):
                return new Fish(10);
        }
        throw new UnsupportedOperationException("Animal no soportado");
    }

}

package com.company.capdos.patterndesing.factory;

public class Pallets extends Food{
    public Pallets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pallets eaten: " + getQuantity());
    }
}

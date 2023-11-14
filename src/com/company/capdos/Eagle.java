package com.company.capdos;

import java.util.function.Predicate;

public class Eagle implements Fly{
    @Override
    public int getWingsSpan() throws Exception {
        return 10;
    }

    @Override
    public void land() {
        System.out.println("Metodo default puedo o no implementarlo");
    }
}

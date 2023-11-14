package com.company.capdos.progfuncion.interfaces;

public class Oceanographer {
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String[] args) {
        Oceanographer oceanographer = new Oceanographer();
        oceanographer.checkSound(new Dolphin());
        oceanographer.checkSound(new Whale());
    }
}

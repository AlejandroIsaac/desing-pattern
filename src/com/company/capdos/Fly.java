package com.company.capdos;

public interface Fly {
    public abstract int getWingsSpan() throws Exception;
    public static final int MAX_SPEED= 100;


    public default void land(){
        System.out.println("Metdo default");
    }
    public static double calculateSpeet(double distance, double time){
        return distance/time;
    }
}

package com.company.capdos.patterndesing.singleton;

public class VisitorTicketTraker {
    private static VisitorTicketTraker instance;
    private VisitorTicketTraker(){}

    public static VisitorTicketTraker getInstance(){
        System.out.println("instance" +instance);
        if(instance == null){
            instance= new VisitorTicketTraker();
        }
        return instance;
    }
}

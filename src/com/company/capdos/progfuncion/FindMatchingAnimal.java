package com.company.capdos.progfuncion;

import java.util.function.Predicate;

public class FindMatchingAnimal{
    private  static void print(Animal animal, Predicate<Animal> check/*CheckTrait checkTrait*/){
        if(check.test(animal)){
            System.out.println(animal);
        }
    }
     public static void main(String[] args){
        print(new Animal("sapo",true,true), a -> a.canHop());
     }
}

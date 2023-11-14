package com.company.entity;

import java.util.Objects;

public class Person {

    public int id;
    public String name;
    public int edad;
    public String genero;


    @Override
    public String toString(){
        return "Name: " + name + " Edad: " + edad + " Genero: " + genero;
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Person)) return false;
        Person personCompare = (Person) object;
        return (this.id == personCompare.id && this.name == personCompare.name);
    }

}

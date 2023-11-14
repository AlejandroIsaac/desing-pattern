package com.company.entity;

public class Student extends Person implements Human{
    String nivelAcademico;

    @Override
    public void nacer() {
        System.out.println("ya naci");
    }

    public void muere(){
        System.out.println("ESTUDIANTE Tambien se lo lleva el saturnino");
    }
}

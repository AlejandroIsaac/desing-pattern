package com.company.enums;

public enum Season {
    WINTER("low"),
    SPRING("medium"),
    SUMMER("high"),
    FALL("extraHigh");
     private String visitors;
     private Season(String visitors){
         this.visitors =visitors;
     }
}

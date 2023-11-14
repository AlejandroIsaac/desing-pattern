package com.company.capdos.patterndesing.singleton;

public class HayStorage {
    //atributos
    private int quantity;
    //contructores
    private HayStorage(){}
    //variable de clase
    private static final HayStorage instance = new HayStorage();
    //metodos de clase
    public static HayStorage getInstance(){
        return instance;
    }
    //metodos de instancia
    public synchronized void addHay(int amount){
        this.quantity += amount;
    }
    public synchronized boolean removeHay(int amount){
        if(amount> this.quantity){
            return false;
        }
        this.quantity -= amount;
        return true;
    }
    public synchronized int getHayQuantity(){
        return this.quantity;
    }
}

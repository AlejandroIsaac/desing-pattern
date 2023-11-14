package com.company;

import com.company.capdos.Eagle;
import com.company.capdos.Fly;
import com.company.capdos.patterndesing.inmmutableobject.AccountBank;
import com.company.capdos.patterndesing.singleton.HayStorage;
import com.company.capdos.patterndesing.singleton.VisitorTicketTraker;
import com.company.entity.Human;
import com.company.entity.Obrero;
import com.company.entity.Person;
import com.company.entity.Student;
import com.company.enums.Season;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*enum Sares{
        x,y,z
    }
    private String greeting= "hola munco";


    public class Interna{
        int repeat=3;
        public void  go(){
            for(int i =0; i<repeat; i++){
                System.out.println(greeting);
            }
        }
    }
    public  void callInterna(){
        Interna interna = new Interna();
        interna.go();


    }*/

    public static void main(String[] args) throws Exception {


       /* VisitorTicketTraker visitorTicketTraker = VisitorTicketTraker.getInstance();
        System.out.println("visitorTicketTraker1 " + visitorTicketTraker);
        VisitorTicketTraker visitorTicketTraker1 = VisitorTicketTraker.getInstance();
        System.out.println("visitorTicketTraker1 " + visitorTicketTraker1);*/
        /*HayStorage hayStorage = HayStorage.getInstance();
        System.out.println("HayStorage0 " + hayStorage);

        HayStorage hayStorage1 = HayStorage.getInstance();
        System.out.println("HayStorage0 " + hayStorage1);

        HayStorage hayStorage2 = HayStorage.getInstance();
        System.out.println("HayStorage0 " + hayStorage2);

        HayStorage hayStorage3 = HayStorage.getInstance();
        System.out.println("HayStorage0 " + hayStorage3);*/


        /*Fly eagle = new Eagle();
        System.out.println(eagle.getWingsSpan());
        eagle.land();


        System.out.println(Fly.MAX_SPEED);
        System.out.println(Fly.calculateSpeet(10.0,20.0));*/

        /* Sares s = Sares.y;
        Main main = new Main();
        main.callInterna();*/

	// write your code here

        //System.out.println(Season.WINTER);
        /*Season season =Season.SUMMER;
        switch (season){
            case WINTER:
                System.out.println("hace frio");
                break;
            case SUMMER:
                System.out.println("hace calor");
                break;
            default:
                System.out.println("no se hace nada");
        }*/
       /*Person person = new Person();
       Person person1 = new Person();

       person.id=100;
       person.name= "Andres";

       person1.id = 100;
       person1.name="mario";

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
*/
        //System.out.println("Studen es una Person " + (estudiante1 instanceof Person));
        //System.out.println("Stauden es un Obrero " + (estudiante1 instanceof obrero));
        //System.out.println("Studen es una Human " + (estudiante1 instanceof Human));
        //System.out.println("Obreo es una Human " + (obrero instanceof Human));
       /* person.name="jose";
        person.edad= 30;
        person.genero = "Masculino";
        System.out.println(person);

        List<String> list = new ArrayList<>();
        list.add("Daniel");
        System.out.println(list);*/
        /*char letra = 'a';
        char letra1 = 'a';


        System.out.println(5 == 5);
        System.out.println(person == person1);
        System.out.println(letra==letra1);*/

    }
}

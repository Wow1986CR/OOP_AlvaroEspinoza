package com.ucreativa;

import com.ucreativa.familia.Alvaro;
import com.ucreativa.familia.Lizbeth;

public class Main {

    public static void main(String[] args) {

        //Alvaro comelon = new Alvaro();
        Lizbeth mama = new Lizbeth("Hello hello");

        mama.setAge(67);
        int ageMami = mama.getAge();
        System.out.println(ageMami);
        System.out.println("Mami loves to " + mama.getHobby());


    }
}

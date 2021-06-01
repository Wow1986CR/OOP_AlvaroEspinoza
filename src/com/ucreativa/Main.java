package com.ucreativa;


import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar motherAlvaro = new Familiar("Lizbeth","111222333",70,true,"mother");
        Familiar brotherAlvaro = new Familiar("Jose","111222444",29,false,"brother");
        Amigo friendAlvaro = new Amigo("Alla","88887777",45,true,"friends","allan@facebook33");

        List<Persona> family = new ArrayList<>();
        family.add(motherAlvaro);
        family.add(brotherAlvaro);
        family.add(friendAlvaro);




    }
}

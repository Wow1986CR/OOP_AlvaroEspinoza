package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar motherAlvaro = new Familiar("Lizbeth","111222333",70,true,"mother");
        Familiar brotherAlvaro = new Familiar("Jose","111222444",29,false,"brother");
        Amigo friendAlvaro = new Amigo("Alla","88887777",45,true,"friends","allan@facebook33");

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(motherAlvaro,"Pfizer",new Date()));
        bitacora.add(new BitacoraVacunas(motherAlvaro,"AstraZeneca",new Date()));
        bitacora.add(new BitacoraVacunas(friendAlvaro,"Johnson",new Date()));





    }
}

package com.ucreativa;

import com.ucreativa.familia.Alvaro;
import com.ucreativa.familia.Lizbeth;

public class Main {

    public static void main(String[] args) {

        Alvaro comelon = new Alvaro();
        Lizbeth saludando = new Lizbeth("Hola hola");
        saludando.setAge(67);
        int edadMami = saludando.getAge();
        System.out.println(edadMami);


    }
}

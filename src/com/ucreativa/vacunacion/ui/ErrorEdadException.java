package com.ucreativa.vacunacion.ui;

public class ErrorEdadException extends Exception{

    public ErrorEdadException(String ageInteger){
        super("El valor ingresado en el campo edad no corresponde: " + ageInteger);
    }
}

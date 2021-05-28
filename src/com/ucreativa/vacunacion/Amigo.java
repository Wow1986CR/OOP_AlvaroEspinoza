package com.ucreativa.vacunacion;

public class Amigo extends Persona{
   private String relationship;
   private String facebook;


    public Amigo(String name, String id, int age, boolean risk) {
        super(name, id, age, risk);
    }

    public String getRelationship() {
        return relationship;
    }

    public String getFacebook() {
        return facebook;
    }
}

package com.ucreativa.vacunacion;

public class Amigo extends Persona{
   private String relationship;
   private String facebook;


    public Amigo(String name, String id, int age, boolean risk, String relationship, String facebook) {
        super(name, id, age, risk);
        this.relationship = relationship;
        this.facebook = facebook;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getFacebook() {
        return facebook;
    }
}

package com.ucreativa.vacunacion.entities;

public class Familiar extends Persona {

    private String familyRelationship;

    public Familiar(String name, String id, int age, boolean risk, String familyRelationship) {
        super(name, id, age, risk);
        this.familyRelationship = familyRelationship;
    }

    public String getFamilyRelationship() {
        return familyRelationship;
    }
}

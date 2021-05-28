package com.ucreativa.vacunacion;

public class Familiar extends Persona {

    private String familyRelationship;

    public Familiar(String name, String id, int age, boolean risk) {
        super(name, id, age, risk);
    }

    public String getFamilyRelationship() {
        return familyRelationship;
    }
}

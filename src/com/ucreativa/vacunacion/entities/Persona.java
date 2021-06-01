package com.ucreativa.vacunacion.entities;

public class Persona {
    private String name;
    private String id;
    private int age;
    private boolean risk;

    public Persona(String name, String id, int age, boolean risk) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Boolean getRisk() {
        return risk;
    }

    public void setAge(int age) {
        this.age = this.age+1;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }
}

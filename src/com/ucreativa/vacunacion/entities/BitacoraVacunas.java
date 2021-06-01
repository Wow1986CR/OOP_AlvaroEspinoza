package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacoraVacunas {
    private Persona person;
    private String brand;
    private Date date;

    public BitacoraVacunas(Persona person, String brand, Date date) {
        this.person = person;
        this.brand = brand;
        this.date = date;
    }

    public Persona getPerson() {
        return person;
    }

    public String getBrand() {
        return brand;
    }

    public Date getDate() {
        return date;
    }
}

package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.ui.ErrorEdadException;

import java.util.Date;
import java.util.List;

public class BitacoraService {
    private Repository repository;
    private ContadorRiesgo contador;

    public BitacoraService(Repository repository) {
        this.repository = repository;
        this.contador = ContadorRiesgo.getInstance();

    }

    public void save(String name, String idNumber, String txtAge, boolean risk,
                     boolean isFriend, String friendRelationship,
                     String facebookAccount, String relationship, String brand) throws ErrorEdadException {
        int ageInteger;
        try{
            ageInteger = Integer.parseInt(txtAge);
        } catch (NumberFormatException x) {
            throw new ErrorEdadException(txtAge);
        }

        if (risk){
            this.contador.SumarRiesgo();
        }

        Persona persona;
        if (isFriend){
            persona = new Amigo(name, idNumber, ageInteger, risk, friendRelationship, facebookAccount);
        }else{
            persona = new Familiar(name, idNumber, ageInteger, risk, relationship);
        }
        this.repository.save(persona,brand,new Date());
    }

    public List<String> get(){
        System.out.println("La cantidad de Personas con riesgo es: "+this.contador.getCantidadRiesgo());
        return this.repository.get();
    }
}

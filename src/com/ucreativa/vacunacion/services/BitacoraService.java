package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {
    private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }


    public void save(String name, String idNumber, String age, boolean risk,
                     boolean isFriend, String friendRelationship,
                     String facebookAccount, String relationship, String brand){
        int ageInteger = Integer.parseInt(age);
        Persona persona;
        if (isFriend){
            persona = new Amigo(name, idNumber, ageInteger, risk, friendRelationship, facebookAccount);
        }else{
            persona = new Familiar(name, idNumber, ageInteger, risk, relationship);
        }
        this.repository.save(persona,brand,new Date());
    }

    public List<String> get(){
        return this.repository.get();
    }
}

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


    public void save(String name, String idNumber, String age, String risk,
                     String isFriend, String friendRelationship,
                     String facebookAccount, String relationship, String brand){
        int ageInteger = Integer.parseInt(age);
        boolean isFriendBoolean = isFriend.equals("A");
        boolean isRiskBoolean = risk.equals("Y");
        Persona persona;
        if (isFriendBoolean){
            persona = new Amigo(name, idNumber, ageInteger, isRiskBoolean, friendRelationship, facebookAccount);
        }else{
            persona = new Familiar(name, idNumber, ageInteger, isRiskBoolean, relationship);
        }
        this.repository.save(persona,brand,new Date());
    }

    public List<String> get(){
        return this.repository.get();
    }
}

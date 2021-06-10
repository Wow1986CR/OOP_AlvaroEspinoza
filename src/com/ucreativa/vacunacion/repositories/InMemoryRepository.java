package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository{

    private final List<BitacoraVacunas> db;

    public InMemoryRepository() {
        this.db = new ArrayList<>();
    }

    public void save(Persona person, String brand, Date date){
        this.db.add(new BitacoraVacunas(person, brand, date));
    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for (BitacoraVacunas item : db){
            lines.add(item.getPerson().getName()
                    +" - "+item.getBrand()
                    +" - "+format.format(item.getDate()));
        }
        return lines;
    }
}

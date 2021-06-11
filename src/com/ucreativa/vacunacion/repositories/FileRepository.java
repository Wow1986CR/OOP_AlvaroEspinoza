package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{
    private final String FILE_PATH = "db.txt";

    @Override
    public void save(Persona person, String brand, Date date) {
        //Logica para obtener los datos:
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String text = person.getName() +" - " + brand +" - " + format.format(date) + "\n";

        //Logica para escritura en un archivo:
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH,true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<String> get() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

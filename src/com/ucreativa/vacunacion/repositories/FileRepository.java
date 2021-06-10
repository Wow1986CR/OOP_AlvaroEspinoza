package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    @Override
    public void save(Persona person, String brand, Date date) {
        //Logica para obtener los datos:



        //Logica para escritura en un archivo:
        String lineaEscritura = person+","+brand+","+date;
        String archivoEscritura = "C:\\Users\\alvar\\Accesos_Directos\\Academia\\UCreativa\\ArchivoEscritura.csv";
        BufferedWriter bufferSalida = null;
        try {
            bufferSalida = new BufferedWriter(new FileWriter(archivoEscritura, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferSalida.write(lineaEscritura);
            bufferSalida.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<String> get() {
        return null;
    }
}

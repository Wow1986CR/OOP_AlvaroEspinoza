package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InMemoryRepository repo = new InMemoryRepository();
        Scanner in = new Scanner(System.in);
        Persona person;
        String name, idNumber, age, risk, isFriend, friendRelationship, facebookAccount, relationship, brand;
        while (true) {
            System.out.println("Name:");
            name = in.nextLine();
            System.out.println("ID Number:");
            idNumber = in.nextLine();
            System.out.println("Age:");
            age = in.nextLine();
            System.out.println("Risk(Y/N):");
            risk = in.nextLine();
            System.out.println("Friend(A)/Family(F):");
            isFriend = in.nextLine();
            if (isFriend.equals("A")) {
                System.out.println("Relationship:");
                friendRelationship = in.nextLine();
                System.out.println("Facebook:");
                facebookAccount = in.nextLine();
                person = new Amigo(name, idNumber, Integer.parseInt(age), risk.equals("S"), friendRelationship, facebookAccount);
            } else {
                System.out.println("Family relationship:");
                relationship = in.nextLine();
                person = new Familiar(name, idNumber, Integer.parseInt(age), risk.equals("S"), relationship);
            }
            System.out.println("Vaccine -- Brand:");
            brand = in.nextLine();

            repo.save(person, brand, new Date());

            System.out.println("Do you want to print the list? (Y)");
            String print = in.nextLine();
            if (print.equals("Y")) {
                for (String item : repo.get()) {
                    System.out.println(item);
                }
            }
        }
    }
}

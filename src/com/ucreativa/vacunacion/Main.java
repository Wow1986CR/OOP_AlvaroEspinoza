package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String name, idNumber, age, risk, isFriend, friendRelationship = "", facebookAccount = "", relationship = "", brand;
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
            } else {
                System.out.println("Family relationship:");
                relationship = in.nextLine();
            }
            System.out.println("Vaccine -- Brand:");
            brand = in.nextLine();

            service.save(name, idNumber, age, risk, isFriend, friendRelationship, facebookAccount, relationship, brand);
            System.out.println("Do you want to print the list? (Y)");
            String print = in.nextLine();
            if (print.equals("Y")) {
                for (String item : service.get()) {
                    System.out.println(item);
                }
            }
        }
    }
}

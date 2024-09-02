package com.empreintecarbone;

import java.util.Scanner;

public class Menu {
    public  void menuPrincipale() {
        int choix;
        GestationUser gestationUser = new GestationUser();

        do {
            System.out.println ("******* Weclom to GreenPulse ******* \n \n " +
                    "1. Ajouter utilisateur \n \n " +
                    "2. Modifier utilisateur \n \n " +
                    "3. Supprimer utilisateur \n \n " +
                    "4. Afficher les utilissateurs \n \n " +
                    "5. Afficher un utilisateur \n \n" +
                    "6. Quitter\n \n " );
            Scanner scan = new Scanner (System.in);
            choix = scan.nextInt ();
            scan.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("veuillez saisir le nom :");
                    String nom = scan.nextLine();
                    System.out.println("veuillez saisir l'age :");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.println("veuillez saisir l'id :");
                    String id = scan.nextLine();

                    gestationUser.createUser(nom,age,id);
                    break;
                case 2:
                    System.out.println("veuillez saisir l'id :");
                    id = scan.nextLine();
                    System.out.println("veuillez saisir le nom :");
                    String newName = scan.nextLine();
                    System.out.println("veuillez saisir l'age :");
                    int newAge = scan.nextInt();

                    gestationUser.updateUser(newName,newAge,id);
                    break;
                case 3:
                    System.out.println("veuillez saisir l'id :");
                    id = scan.nextLine();
                    gestationUser.deleteUser(id);
                    break;
                case 4:
                    gestationUser.getUsers();

            }

        } while (choix != 0);
    }
}

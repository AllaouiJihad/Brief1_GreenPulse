package com.empreintecarbone;

import java.time.LocalDate;
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
                    "6. Ajouter votre consommation de carbon\n \n" +
                    "7. Quitter\n \n " );
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
                    break;
                case 5:
                    System.out.println("veuillez saisir l'id :");
                    id = scan.nextLine();
                    gestationUser.getUser(id);
                    break;
                case 6:
                    System.out.println("veuillez saisir l'id :");
                    id = scan.nextLine();
                    System.out.println("veuillez entrer la valeur de votre consommation carbon :");
                    int value = scan.nextInt();
                    scan.nextLine();

                    System.out.println("veuillez entrer la date de depart (YYYY-MM-DD) :");
                    LocalDate startDAte = LocalDate.parse(scan.nextLine());

                    System.out.println("veuillez entrer la date fin (YYYY-MM-DD)");
                    LocalDate endDAte = LocalDate.parse(scan.nextLine());

                    GestionConsommation gestionConsommation = new GestionConsommation();
                    CarbonConsommation consommation = gestionConsommation.addCarbonConsommation(id,startDAte,endDAte,value);
                    gestationUser.addConsomationToUser(id,consommation);
            }

        } while (choix != 0);
    }
}

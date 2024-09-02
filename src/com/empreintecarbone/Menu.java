package com.empreintecarbone;

import java.util.Scanner;

public class Menu {
    public  void menuPrincipale() {
        int choix;
        do {
            System.out.println ("******* Weclom to GreenPulse ******* \n \n " +
                    "1. Ajouter utilisateur \n \n " +
                    "2. Modifier utilisateur \n \n " +
                    "3. Supprimer utilisateur \n \n " +
                    "4. Afficher les utilissateurs \n \n " +
                    "5. Afficher un utilisateur \n \n" );
            Scanner scan = new Scanner (System.in);
            choix = scan.nextInt ();

            switch (choix) {
                case 1:
                    System.out.println("veuillez saisir le nom :");
                    String nom = scan.nextLine();

                    break;
            }

        } while (choix != 2);
    }
}

package org.example.exercice;

import java.util.Scanner;

public class Exercice54 {
    public static void main(String[] args) {
        //exercice 4
        /*
        1. Créer une variable age et lui affecter une valeur
        2. Vérifier si la personne est mineure ou majeure à l'aide des opérateurs logiques
        3. Afficher le résultat
        4. /!\ Ne pas utiliser de structure conditionnelle
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisire age :");
        int age = scanner.nextInt();
        System.out.println(age >=18 );
    }
}

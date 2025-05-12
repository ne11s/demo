package org.example.exercice;

import java.util.Scanner;

public class Exercice56 {
    public static void main(String[] args) {
        //exercice 6
        /*
         1. Saisir une chaine et la stocker dans une variable
         2. Effectuer les traitements suivants :
         1. Afficher la chaîne en minuscule
         2. Afficher la chaîne en majuscule
            3. Bonus
                1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
                2. Afficher la première lettre de chaque mot en majuscule
         */
        Scanner scanner = new Scanner(System.in);
        String chaine;
//        System.out.println("saisir une chaine de carractere :");
//        chaine = scanner.nextLine();
        chaine ="ma chaine de carractere";
        chaine.charAt(1);
        System.out.println("En minuscule "+chaine.toLowerCase());
        System.out.println("En majuscule "+chaine.toUpperCase());
    }
}

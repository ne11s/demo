package org.example.exercice;

import java.util.Arrays;
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
        System.out.println("saisir une chaine de carractere :");
        chaine = scanner.nextLine();


        System.out.println("En minuscule "+chaine.toLowerCase());
        System.out.println("En majuscule "+chaine.toUpperCase());
        firstInMaj(chaine);
        toarray(chaine);
    }
    public static void toarray(String argument){
        char[] montabdechar = new char[argument.length()];
        for (int i = 0 ; i< argument.length(); i++) {
            montabdechar[i] = argument.charAt(i);
        }

        System.out.println(Arrays.toString(montabdechar));
    }

    public static void firstInMaj(String argument) {
        String prochaine = "";

        for (int i = 0 ; i< argument.length();i++) {
            char lettre = argument.charAt(i);
            if (i == 0) {
                prochaine += Character.toString(lettre).toUpperCase();
            } else if (lettre == ' ') {

                String space = Character.toString(argument.charAt(i));
                String moncara = Character.toString(argument.charAt(i+1));
                prochaine+= space;
                prochaine+= moncara.toUpperCase();
                i++;
            } else {
                String moncara = Character.toString(argument.charAt(i)).toLowerCase();
                prochaine+= moncara;
            }

        }
        System.out.println(prochaine);
    };
}

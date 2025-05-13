package org.example.exercice;

import java.util.Scanner;

public class Exercice68 {
    public static void main(String[] args) {
        //exercice 8
        /*
         1. Créer une variable age
         2. Affecter une valeur à la variable age
         3. Créer une condition qui permet d'afficher si la personne est
         majeure ou mineure
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("saisire un age : ");
        int age = scanner.nextInt();
        System.out.println(" Vous êtes "+ (age <18? "majeur vous pouvez" :"mineur vous ne pouvez pas") + " rentrer dans le club");
    }
}

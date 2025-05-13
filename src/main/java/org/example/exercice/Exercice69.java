package org.example.exercice;

import java.util.Scanner;

public class Exercice69 {
    public static void main(String[] args) {
    /*
     1. Créer une variable nombre de type entier
     2. Affecter une valeur à la variable nombre
     3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
        Utiliser l'opérateur mathématique permettant de retourner le reste d'une
        division euclidienne
    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un nombre entier");
        int nombre = scanner.nextInt();
        System.out.println("le nombre saisi est "+ (nombre%2 == 0 ? "paire" : "impaire"));
    }
}

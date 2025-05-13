package org.example.exercice;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        //exercice 7
        /*
        1. Saisir la longueur du côté du carré et la stocker dans une variable
        2. Calculer l'aire et le périmètre du carré
        */
        float cote;
        System.out.println("saisir la longueur d'un coté (en cm) :");
        cote = scanner.nextFloat();
        System.out.println("Le périmètre du carré est de : " + cote *4 + "cm");
        System.out.println("L'aire du carré est de : " + cote * cote + "cm carré.");
    }
}

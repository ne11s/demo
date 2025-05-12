package org.example.exercice;

import java.util.Scanner;

public class Exercice55 {
    public static void main(String[] args) {
        //exercice 5
        /*

         */
        Scanner scanner = new Scanner(System.in);
        double r,h;
        System.out.println("saisir un rayon :");
        r= scanner.nextDouble();
        System.out.println("saisir une hauteur :");
        h= scanner.nextDouble();
        double volume=(1f/3f) * Math.PI * (r*r)* h;
        System.out.println("Le volume du cône est de "+ volume + " cm3");

    }
}

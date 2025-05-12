package org.example.exercice;

public class exercice52 {
    public static void main(String[] args) {
        //exercice 2
        /*
        1. Écrire un programme qui permet de permuter les valeurs entre deux variables
         */
        int a=3;
        int b=2;
        System.out.println("avant permutation: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c= b;
        b = a;
        a = c;
        System.out.println("apres permutation: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

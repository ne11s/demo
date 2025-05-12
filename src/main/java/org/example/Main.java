package org.example;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        String nom = "san" ;
        String prenom="nel";
        System.out.println("Bonjour " + prenom +" "+nom);

        //exercice 2
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
        int result = (a*a) + (b*b);
        System.out.println(" La somme des carrés de a et b est :"+ result );
    }
}
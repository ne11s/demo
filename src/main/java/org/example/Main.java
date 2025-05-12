package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
//
//        //Exercice 1
//        /*
//
//         */
//        String nom = "san" ;
//        String prenom="nel";
//        System.out.println("Bonjour " + prenom +" "+nom);

//        //exercice 2
//        /*
//
//         */
//        int a=3;
//        int b=2;
//        System.out.println("avant permutation: ");
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        int c= b;
//        b = a;
//        a = c;
//        System.out.println("apres permutation: ");
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        //exercice 3
//        /*
//
//         */
//        int result = (a*a) + (b*b);
//        System.out.println(" La somme des carrés de a et b est :"+ result );
        //exercice 4
        /*

         */
//        System.out.println("saisire age :");
//        int age = scanner.nextInt();
//        System.out.println(age >=18 );

        //exercice 5
        /*

         */
//        double r,h;
//        System.out.println("saisir un rayon :");
//        r= scanner.nextDouble();
//        System.out.println("saisir une hauteur :");
//        h= scanner.nextDouble();
//        System.out.println("Le volume du cône est de"+ 1/3* Math.PI * (r*r)* h + " cm3");

        //exercice 6
        /*

         */
        String chaine;
        System.out.println("saisir une chaine de carractere :");
        chaine = scanner.nextLine();
        System.out.println("En minuscule"+chaine.toLowerCase());
        System.out.println("En majuscule"+chaine.toUpperCase());
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
        //exercice 8
        /*
         1. Créer une variable age
         2. Affecter une valeur à la variable age
         3. Créer une condition qui permet d'afficher si la personne est
         majeure ou mineure
         */
        int age2=18;
      //  System.out.println(" Vous êtes "+ (age <18? "majeur vous pouvez" :"mineur vous ne pouvez pas") + " rentrer dans le club");
    }
}
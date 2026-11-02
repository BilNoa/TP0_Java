/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * Noa Bilong
 * BDML2
 * TP 0 Partie3 Calculator
 * 02/11/2026
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
       
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();

       
        if (operateur < 1 || operateur > 5) {
            System.out.println("erreur d'operateur");
            sc.close();
            System.exit(0);
        }

        System.out.println("Entrez le premier nombre: ");
        float operande1 = sc.nextFloat();
        System.out.println("Entrez le deuxième nombre: ");
        float operande2 = sc.nextFloat();

        float resultat = 0;
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
        }

        System.out.println("resultat : " + resultat);
        sc.close();
    }
}
    


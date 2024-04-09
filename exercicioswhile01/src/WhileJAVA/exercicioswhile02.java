package WhileJAVA;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinicius ryann
 */
public class exercicioswhile02 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        int n1 = input.nextInt();
        System.out.println("Escreva um segundo número");
        int n2 = input.nextInt();
        
        input.close();
        
        if (n1 > n2) {
            int i = n2;
            
            while (i <= n1) {
                if (i % 2 == 0) {
                    System.out.println(i); }
                i++;
            }
        } else if (n1 < n2) {
            int i = n1;
             while (i <= n2) {
                if (i % 2 != 0) {
                    System.out.println(i); 
                }
                i++;
        
             }
        } else {
                System.out.println("Os números são iguais");
                     
        }
        
    }   
}

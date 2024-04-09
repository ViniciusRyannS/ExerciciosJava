/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopepoul;

import java.util.Scanner;

/**
 *
 * @author vinicius ryann
 */
public class ex1api {
    public static void main(String[] args) {
        
        //Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
//deve somar 150 a esse número. No final, imprimir o resultado da soma.

        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número");
        double n1 = input.nextDouble();
        
        
   
        if (n1 >= 101) {
            System.out.println("O valor do seu número é : " + (n1 + 150) );
        }
}
}

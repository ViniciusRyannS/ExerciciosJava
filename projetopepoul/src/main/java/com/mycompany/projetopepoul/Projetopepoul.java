

package com.mycompany.projetopepoul;

import java.util.Scanner;


public class Projetopepoul {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in);
        //comando escreva
        
        System.out.println("Olá, seja bem vindo ao seu sistema de notas!!!");
        
        String nome = "Pericles";
        System.out.println("Olá, " + nome);
        
        System.out.println("Digite o seu nome: ");
        nome = entrada.next();
        System.out.println("Olá, " + nome);
        
        
    }
}

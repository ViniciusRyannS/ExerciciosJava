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
public class exercicio2 {
    public static void main(String[] args) {
        
//        criando um objeto tipo scanner

        Scanner input = new Scanner ( System.in);
        
        System.out.println("Olá, bem vindo ao sistema de notas da nossa escola! Qual seu nome?");
        // Lendo o nome como String
        String nome = input.next();
        System.out.println("Olá " + nome + "digite suas notas" );
        System.out.println( "calculo das medias" );
        System.out.println( "nota 1:" );
        float n1 = input.nextFloat();
        System.out.println( "nota 2: " );
        float n2 = input.nextFloat();
        System.out.println( "nota 3: " );
        float n3 = input.nextFloat();
        
        
        
        float media = (n1+n2+n3) /3;
        
        if (media <= 4) {
            System.out.println("Poxa, :( que pena " + nome + " ,sua média final foi " +media+ ". infelizmente você foi reprovado..");
        }
        
        else if (media == 5) {
            System.out.println("Poxa, :( que pena " + nome + ", sua média final foi " +media+ ". infelizmente você não foi aprovado, porém terá um teste final como recuperação!");         
        }
        
        else {
            System.out.println("Parabéns " + nome + ", você foi aprovado!!!");
        }
        //Saida de dados
        System.out.println("Olá " + nome + ", sua média é " + media );
        
        
        
        
        
        
    }
}

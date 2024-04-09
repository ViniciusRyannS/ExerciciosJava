/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WhileJAVA;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vinicius ryann
 */
public class Exercicioswhile01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        int numeroOculto = rnd.nextInt(100);
        
        System.out.println("Tente adivinhar o número oculto (entre 0 e 99):");
        
        int tentativas = 0;
        while (true) { 
            int tentativa = input.nextInt(); 
            tentativas++;
            
            if (tentativa == numeroOculto) {
                System.out.println("Parabéns! Você acertou o número oculto em " + tentativas + " tentativas.");
                break; 
            } else if (tentativa < numeroOculto) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }
        
        input.close();
    }
}
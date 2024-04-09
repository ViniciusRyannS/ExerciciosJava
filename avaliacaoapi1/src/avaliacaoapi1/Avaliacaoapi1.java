/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacaoapi1;

import java.util.Scanner;

/**
 *
 * @author vinicius ryann
 */
public class Avaliacaoapi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double etanol = 3.65;
        double gasolina = 4.79;
        int produto = input.nextInt();
        double litros = 0;
        
        System.out.println("Quantos litros deseja abastecer? ");
        litros = input.nextInt();
        
        
    }
    
}

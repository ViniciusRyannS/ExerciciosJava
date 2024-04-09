/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author vinicius ryann
 */
public class Switchcase {

   
    public static void main(String[] args) {
      

//Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a
//mensagem constante na tabela a seguir. Aos alunos que ficaram para exame, calcule e mostre a nota
//que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua primeira nota?");
        double n1 = input.nextDouble();
        System.out.println("Qual sua segunda nota?");
        double n2 = input.nextDouble();
        System.out.println("Qual sua terceira nota?");
        double n3 = input.nextDouble();
        double media = (n1 + n2 + n3) /3;

        boolean verificacao = true;
        while (verificacao == true) {
            System.out.println("Caso queira saber sua média, digite o n1. \n "
            + "Caso sua nota esteja vermelha, digite 2 para saber quanto falta para alcançar sua média.");
            int infoswitch = input.nextInt();
            

            switch (infoswitch) {
                case 1:
                    System.out.println("Sua média é de " + media ); 
                    break;
                case 2:
                    if (media <= 3) {
                        System.out.println("REPROVADO");
                    }
                    else if (media > 3 && media <= 7) {
                        System.out.println("EXAME");
                        System.out.println("Você tirou " + media+ "para conseguir chegar na média faltam" + (media - 6.0)+ "para passar." );
                    }
                    else {
                        System.out.println("APROVADO");
                    }
                    break;
                case 3:
                    verificacao = false;
                default:  
                    
                   
            
}   }
    }
}
            


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinicius ryann
 */
public class ex2api {
    public static void main(String[] args) { 
    //Dados dois números, verificar se a divisão do primeiro número pelo
//segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
//algoritmo deve imprimir a mensagem “A divisão de (número 1) por
//(número 2) é exata”.

        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número");
        System.out.println("Digite outro número");
        double vlr1 = input.nextDouble();
        double vlr2 = input.nextDouble();
        double total = vlr1 / vlr2;
        double resultadofinal = total % 0;
        
        if (resultadofinal ==  0) {
            System.out.println("A divisão de " + vlr1 + " por " + vlr2 + "é exata.");
        }
    else {
            System.out.println("A divisão de " + vlr1 + " por " + vlr2 + "não é exata.");
}
}
    
}

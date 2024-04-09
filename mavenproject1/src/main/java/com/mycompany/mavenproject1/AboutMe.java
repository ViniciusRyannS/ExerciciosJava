/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author vinicius ryann
 */
//public class Mavenproject1 {

    import java.util.Locale;
    import java.util.Scanner;

    public class AboutMe{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome: ");
        String Nome = scanner.next();

        System.out.println("Digite Seu Sobrenome: ");
        String Sobrenome = scanner.next();

        System.out.println("Digite Sua Idade: ");
        int Idade = scanner.nextInt();

        System.out.println("Digite a sua Altura: ");
        Double Altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + Nome + " " + Sobrenome);
        System.out.println("Minha Idade é: " + Idade);
        System.out.println("Minha Altura é: " + Altura);
    }
}

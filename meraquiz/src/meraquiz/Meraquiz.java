/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meraquiz;

import java.util.Scanner;

public class Meraquiz {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         int pontuacao = 0; 
    boolean perguntaSecretaDesbloqueada = false; 
    
        System.out.println("Bem Vindo ao Meraquiz!");
        System.out.println("O Meraquiz faz parte do Projeto Integrador da faculdade de Análise e Desenvolvimento de Sistemas regida pelo Centro Universitário Senac Santo Amaro. ");
        System.out.println("Digite seu nome de usuário: ");
        String nome = input.nextLine();
        System.out.println("Seja bem vindo e boa sorte " + nome + "! Escolha seu tema predileto e bom quiz! "
                + "(Cada pergunta que você acertar, te garante 20 pontos, acertando 100% você libera a pergunta final secreta! )");
        
        System.out.println(nome+ ", Você escolheu Conhecimentos Gerais, baseado nisso, vamos começar!");
        System.out.println("1. Quem foi a primeira pessoa a viajar no Espaço?(Escolha utilizando a letra que achar correto)\n" +
                            "a) Yuri Gagarin\n" +
                            "b) A cadela Laika\n" +
                            "c) Neil Armstrong\n" +
                            "d) Marcos Pontes\n" +
                            "e) Buzz Aldrin");
        String resp1conhgerais = input.nextLine();
        if (resp1conhgerais.equals("a")) {
            System.out.println("Resposta Correta! Parabéns + 20 pontos, o russo Yuri Gagarin (1934-1968) foi a primeira pessoa a viajar para o espaço, o que aconteceu em 12 de abril de 1961.");
        pontuacao +=20;}
        else if (resp1conhgerais.equals("b")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp1conhgerais.equals("c")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp1conhgerais.equals("d")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp1conhgerais.equals("e")) {
            System.out.println("Resposta Incorreta");
        }
        else {
            System.out.println("Letra não encontrada");
        }
        
        System.out.println("2. Quais são as fases da Lua?\n" +
        "a) Nova, cheia e superlua\n" +
        "b) Penumbral, lunar parcial, lunar total e cheia\n" +
        "c) Nova, cheia, minguante e lua de sangue\n" +
        "d) Nova, crescente, cheia e minguante\n" +
        "e) Nova, crescente, cheia, minguante e lua de sangue");
        
        String resp2conhgerais = input.nextLine();
        if (resp2conhgerais.equals("a")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp2conhgerais.equals("b")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp2conhgerais.equals("c")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp2conhgerais.equals("d")) {
            System.out.println("Resposta Correta! Parabéns + 20 pontos, As fases da lua são quatro: nova, crescente, cheia e minguante. Cada uma delas dura 7 ou 8 dias.");
        pontuacao +=20;}
        else if (resp2conhgerais.equals("e")) {
            System.out.println("Resposta Incorreta");
        }
        else {
            System.out.println("Letra não encontrada");
        }
        
        System.out.println("3. Qual o maior planeta do sistema solar?\n" +
        "a) Marte\n" +
        "b) Lua\n" +
        "c) Saturno\n" +
        "d) Terra\n" +
        "e) Júpiter");
        
        String resp3conhgerais = input.nextLine();
        if (resp3conhgerais.equals("a")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp3conhgerais.equals("b")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp3conhgerais.equals("c")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp3conhgerais.equals("d")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp3conhgerais.equals("e")) {
            System.out.println("Resposta Correta! Parabéns + 20 pontos, Júpiter é 1300 vezes maior que a Terra, sendo o maior planeta do sistema solar.");
        pontuacao +=20;}
        else {
            System.out.println("Letra não encontrada");
        }
        
        System.out.println("4. Quais as duas línguas mais faladas no mundo?\n" +
        "a) Inglês e espanhol\n" +
        "b) Inglês e mandarim chinês\n" +
        "c) Mandarim chinês e francês\n" +
        "d) Inglês e português\n" +
        "e) Inglês e aramaico");
        
        String resp4conhgerais = input.nextLine();
        if (resp4conhgerais.equals("a")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp4conhgerais.equals("b")) {
            System.out.println("Resposta Correta! Parabéns + 20 pontos, O inglês e o mandarim chinês são as línguas que têm mais falantes (nativos e estrangeiros) no mundo.");
        pontuacao +=20;}
        else if (resp4conhgerais.equals("c")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp4conhgerais.equals("d")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp4conhgerais.equals("e")) {
            System.out.println("Resposta Incorreta");
        }
        else {
            System.out.println("Letra não encontrada");
        }
        
        System.out.println("Qual o monumento famoso pela sua inclinação?\n" +
        "a) Torre Eiffel\n" +
        "b) Esfinge\n" +
        "c) Estátua da Liberdade\n" +
        "d) Cristo Redentor\n" +
        "e) Torre de Pisa");
        
        String resp5conhgerais = input.nextLine();
        if (resp5conhgerais.equals("a")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp5conhgerais.equals("b")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp5conhgerais.equals("c")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp5conhgerais.equals("d")) {
            System.out.println("Resposta Incorreta");
        }
        else if (resp5conhgerais.equals("e")) {
            System.out.println("Resposta Correta! Parabéns + 20 pontos, A Tore de Pisa, que fica na Itália, também é conhecida como Torre Inclinada de Pisa. Um dos motivos que fizeram com que a torre fosse ficando inclinada, ainda durante a sua construção, é que o solo onde ela se encontra é arenoso, macio.");
        pontuacao +=20;}
        else {
            System.out.println("Letra não encontrada");
        }
        
        if (pontuacao >= 100 && !perguntaSecretaDesbloqueada) {
        System.out.println("Parabéns! Você desbloqueou a pergunta secreta!");
        perguntaSecretaDesbloqueada = true;
    }
  
    System.out.println("Pontuação atual: " + pontuacao);
     
     if (perguntaSecretaDesbloqueada) {
        System.out.println("\nPergunta Secreta:");
        System.out.println("De acordo com o filósofo Igor Guilherme, conhecido por muitos como MC IG, quando ele proclamou em um de seus cânticos a frase ''Tem mulher que não depende de homem..'' Em Let's Go 4, qual foi a finalização desse cântico?");
        System.out.println("a) É o correto.");
        System.out.println("b) Problema de todos.");
        System.out.println("c) Problema delas.");
        System.out.println("d) Cordialmente.");
        System.out.println("e) Problema do dito cujo.");

        String respSecreta = input.nextLine();
        if (respSecreta.equalsIgnoreCase("c")) {
            System.out.println("Resposta Correta! Você é realmente um especialista!");
            pontuacao += 50;
        } else {
            System.out.println("Resposta Incorreta. Tente novamente na próxima vez!");
        }
    }
}
    
}   
       
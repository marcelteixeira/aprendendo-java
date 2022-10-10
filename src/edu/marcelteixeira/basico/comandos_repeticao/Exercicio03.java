// 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class Exercicio03 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = scanner.next();

    for(int i = 1; i <= 10; i++){
        System.out.println(i + " - " + nome);
    }

    scanner.close();

   }
    
}

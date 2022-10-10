// 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes. 

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Seu nome: ");
        String nome = scanner.next();

        System.out.println("Quantas vezes gostaria escrever seu nome? ");
        int repeticoes = scanner.nextInt();

        for(int i = 1; i <= repeticoes; i++){
            System.out.println(i + " - " + nome);
        }

        scanner.close();

    }
    
}

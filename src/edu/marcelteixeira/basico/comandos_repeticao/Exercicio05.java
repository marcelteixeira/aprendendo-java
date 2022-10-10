// 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. 

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class Exercicio05 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Digite o numero: ");
            resultado += scanner.nextInt();
        }

        System.out.println("A soma dos numeros digitados e: " + resultado);


        scanner.close();

    }



}

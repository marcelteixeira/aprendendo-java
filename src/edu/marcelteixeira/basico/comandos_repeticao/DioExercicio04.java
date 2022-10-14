/*
 * Faça um programa que peça N números inteiros
 * calcule e mostre a quantidade número pares e ímpares
 */

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio04 {
    
    public static void main(String[] args) {
        int contadorPares = 0;
        int contadorImpares = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Digite um numero: ");
            if(scanner.nextInt() % 2 == 0){
                contadorPares++;
    
            }else {
                contadorImpares++;
            } 
        }while(deveContinuar());

        System.out.println("Foram digitados");
        System.out.println("Numeros Pare: " + contadorPares);
        System.out.println("Numeros Impares: " + contadorImpares);

        scanner.close();

    }

    public static boolean deveContinuar(){
        Scanner scanner = new Scanner(System.in);
        String opcao;
        
        System.out.println("Deseja continuar inserindo números?");
        while(true){
            System.out.print("Digite S para continuar ou N para parar: ");
            opcao = scanner.next();
            scanner.close();
            if(opcao.contentEquals("s") | opcao.contentEquals("S")){
                return true;
            }else if(opcao.contentEquals("n") | opcao.contentEquals("N")){
                return false;
            }else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        
    }
}

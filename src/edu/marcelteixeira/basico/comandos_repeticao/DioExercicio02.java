/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido, continue pedindo até que o usuário informe uma nota válida.
 */
package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio02 {
    
    public static void main(String[] args) {

        int nota;
        
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Digite uma nota (0 a 10): ");
            nota = scanner.nextInt();

        }while(!isNotaValida(nota));

        scanner.close();
        System.out.println("Nota inserida com sucesso.");

    }

    public static boolean isNotaValida(int nota){
        if(nota >= 0 && nota <=10){
            return true;
        } else{
            System.out.println("Nota inválida.");
            return false;
        }
    }

}

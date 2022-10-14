/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima a consoante.
 */

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] caracteres = new String[6];
        String caractereDigitado;
        int contadorConsoantes = 0;

        for(int i = 0; i < 6; i++){
            System.out.print("Digite " + (i + 1) + "º Caractere: ");
            caractereDigitado  = scanner.next().toUpperCase();

            switch (caractereDigitado){
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                break;
                default:
                    caracteres[i] = caractereDigitado;
                    contadorConsoantes++;
            }

            scanner.close();
        }
        System.out.println();
        System.out.print("Consoantes digitadas: ");
        for(String caracter : caracteres){
            if(caracter != null){
                System.out.print(caracter + " ");
            }
        }
        System.out.println();
        System.out.println("Total de consoantes digitados: " + contadorConsoantes);

        
        
    }


}

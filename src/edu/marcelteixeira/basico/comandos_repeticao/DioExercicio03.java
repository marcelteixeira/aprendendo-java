/*
 * Faça um programa que leia 5 números.
 * Informe o maior número
 * Informe a média
 */

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio03 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int somaNumeros = 0;
        int maiorNumero = 0;
        int media;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o número: ");
            numeroDigitado = scanner.nextInt();

            somaNumeros += numeroDigitado;
            
            // Validar se o numero digita é maior que o atual maior número. Se for, o maior numero passara a ser o numero digitado.
            if(numeroDigitado > maiorNumero){
                maiorNumero = numeroDigitado;
            }

        }

        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("A media dos valores digitados é: " + somaNumeros / 5);

    }

}

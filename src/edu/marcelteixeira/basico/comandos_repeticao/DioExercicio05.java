/*
 * Desenvolva um operador de tabuada
 * Deve retornar a tabuada de 1 a 10 do número informado pelo usuário
 */

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite o numero:");
        numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero);

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }
    
}

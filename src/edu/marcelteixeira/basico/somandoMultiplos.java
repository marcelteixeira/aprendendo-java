package edu.marcelteixeira.basico;

import java.util.Scanner;

public class somandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        int resultadoMultiplicacao = 0;
        int total = 0;
        int contador = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite multiplicador: ");
        A = input.nextInt();
        System.out.print("Digite o limite: ");
        N = input.nextInt();

        while(resultadoMultiplicacao < N){
            resultadoMultiplicacao = A * contador;
            contador++;
            total += resultadoMultiplicacao;
        }

        System.out.println(total);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}

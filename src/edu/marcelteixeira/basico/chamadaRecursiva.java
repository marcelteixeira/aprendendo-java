package edu.marcelteixeira.basico;

import java.util.Scanner;

public class chamadaRecursiva {
    public static void main(String[] args) {
        int total = 0;
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero:");
        somatorio(numero.nextInt(), total);
        
        //TODO: Imprima o somatório de N (utilize o método "somatorio").
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero, int total) {
        
        if (numero == 0) {
            System.out.println(total);
            return 0;
        } else {
            total += numero;
            return numero + somatorio(numero - 1, total);
        }
    }
}

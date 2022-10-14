/*
 * Faça um porograma que leia 20 números inteiros (entre 0 e 100) e armazene-os.
 * Depois imprima cada núnero e seu sucessor.
 */
package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Random;

public class DioExercicio09 {

    
    public static void main(String[] args) {
        
        int[] numeroDigitados = new int[20];
        Random random = new Random();
        int  numeroAleatorio;
        for(int i = 0; i < numeroDigitados.length; i++){
            numeroAleatorio = random.nextInt(100);
            System.out.println("Digite um número: " + numeroAleatorio);
            numeroDigitados[i] = numeroAleatorio;
        }

        for(int numeroDigitado : numeroDigitados){
            System.out.println("Numero no indice: " + numeroDigitado + " e seu sucessor é: " + (numeroDigitado + 1));
        }
        
    }
    
}

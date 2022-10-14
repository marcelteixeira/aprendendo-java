/*
 * Crie um vetor de 6 números inteiros
 * Mostre os valores na ordem inversa.
 */

package edu.marcelteixeira.basico.comandos_repeticao;

public class DioExercicio07 {
    
    public static void main(String[] args) {

        int[] valores = {-5, -6, 15, 50, 8, 4};

        for( int i = (valores.length - 1); i >=0 ;  i--){
            System.out.println("Valor no indice " + i + ": " + valores[i]);

        }

    }



}

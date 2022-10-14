/*
 * Gerar e imprirmir uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Random;

public class DioExercicio10 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }


    }
    
}

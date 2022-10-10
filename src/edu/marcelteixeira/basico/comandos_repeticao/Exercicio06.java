// 6) Leia a idade de 20 pessoas e exiba a soma das idades.

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        int resultado = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i + "- Digita a idade: ");   

            resultado += new Scanner(System.in).nextInt();
        }
        System.out.println(resultado);
    }


}

package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        int resultado = 0, idadeDigitada, quantidadeMaioresIdade = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i + "- Digita a idade: ");   
            idadeDigitada = new Scanner(System.in).nextInt();

            if(idadeDigitada >= 18){
                quantidadeMaioresIdade++;
            }

            
        }
        
        
        System.out.println("Pessoas maiores de idade: " + quantidadeMaioresIdade);
    
    }

}

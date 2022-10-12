package edu.marcelteixeira.basico.comandos_repeticao;

import java.util.Scanner;

public class DioExercicio06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int fatorial;
        

        System.out.print("Digite o número que deseja a fatorial: ");
        numero = scanner.nextInt();
        fatorial = numero;
        for(int i = numero - 1; i > 0; i--){
            fatorial *= i;
            
        }
        System.out.println(fatorial);
    }
}

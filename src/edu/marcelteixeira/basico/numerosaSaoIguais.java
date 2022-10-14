package edu.marcelteixeira.basico;

import java.util.Scanner;

public class numerosaSaoIguais {
    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int A = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int B = scanner.nextInt();

       if(A == B){
            System.out.println("Sao iguais!");
       }else {
            System.out.println("Nao sao iguais! ");
        
       }

       scanner.close();

    }
}

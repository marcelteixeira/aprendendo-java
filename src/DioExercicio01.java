/*
 * Faça um programa que receba dois valores (nome e idade).
 * O programa deve continuar recebendo esses valores até que seja digitado 0 no campo nome.
 */

 

import java.util.Scanner;

public class DioExercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade;

        

        while(true){
            System.out.print("Digite um nome, ou  0 para sair: "); 
            nome = scanner.next();
            if(nome.contentEquals("0")){
                break;
            }

            System.out.print("Digite a sua idade: ");
            idade = scanner.nextInt();

            System.out.println(nome + " " + idade);
        }

    }
}

package edu.marcelteixeira.basico.desafios;

import java.util.Scanner;

public class buscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        //DONE: Retorne o valor do elemento no Array junto de sua respectiva posição.
        System.out.println("Qual valor deseja procurar?");
        buscarValor(elementos, leitor.nextInt());
        leitor.close();
    }
    
    public static void buscarValor(int[] elementos, int valor){
        boolean numeroEncontrado = false;
        for(int i = 0; i < elementos.length; i++){
            
            if(elementos[i] == valor){
                System.out.println("Achei "+ valor + " na posição " + i);
                numeroEncontrado = true;
            }
        }

        if(numeroEncontrado == false) {
            System.out.println("Numero " + valor + " nao encontrado!");
        }

    }



}

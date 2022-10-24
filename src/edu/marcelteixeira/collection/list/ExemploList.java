/*
 * Lista de 7 notas de um aluno: 7, 8.5, 9.3, 5, 7, 0, 3.6
 * 
 * DONE: 01 - Crie uma lista e adicione as sete notas.
 * DONE: 02 - Exiba a posição da nota 5.
 * DONE: 03 - Adicione na lista a nota 8.0 na posição 4
 * DONE: 04 - Substitua a nota 5.0 pela nota 6.0.
 * DONE: 05 - Confira se a nota 5.0 está na lsita.
 * DONE: 06 - Exiba todas as notas na ordem que foram informadas.
 * DONE: 07 - Exiba a terceira nota adicionada.
 * DONE: 08 - Exiba a menor nota.
 * DONE: 09 - Exiba a maior nota.
 * DONE: 10 - Exiba a soma dos valores.
 * DONE: 11 - Exiba a média das notas.
 * DONE: 12 - Remova a nota 0.0.
 * DONE: 13 - Remova as notas menores que 7.0 e exiba a lista.
 * DONE: 14 - Apague todos os elementos da lista.
 * DONE: 15 - Confira se a lista está vazia.
 * 
 */

package edu.marcelteixeira.collection.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // 1 - Crie uma lista e adicione as sete notas.
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        // 2 - Exiba a posição da nota 5.
        System.out.println("Posição da nota 5.0: " + notas.indexOf(5.0));

        // 3 - Adicione na lista a nota 8.0 na posição 4
        notas.add(4, 8.0);
        System.out.println("Posição da nota 8.0: " + notas.indexOf(8.0));

        // 4 - Substitua a nota 5.0 pela nota 6.0.
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());
        
        // 5 - Confira se a nota 5.0 está na lsita.
        System.out.println("Existe a nota 5.0 na lista? " + notas.contains(5.0));

        // 6 - Exiba todas as notas na ordem que foram informadas.
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println();

        // 7 - Exiba a terceira nota adicionada.
        System.out.println("Terceira nota adicionada: " + notas.get(2));

        // 8 - Exiba a menor nota.
        System.out.println("A menor nota: " + Collections.min(notas));

        // 9 - Exiba a maior nota.
        System.out.println("A maior nota: " + Collections.max(notas));
        
        // 10 - Exiba a soma dos valores.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        // 11 - Exiba a média das notas.
        Iterator<Double> iterator2 = notas.iterator();
        Double soma2 = 0d;
        while(iterator2.hasNext()){
            soma2 += iterator2.next();
        }
        System.out.println("Média das notas: " + (soma2 / notas.size()));

        notas.remove(notas.indexOf(0.0));
        System.out.println("ArrayLis após remover a nota 0.0: " + notas.toString());

        // 13 - Remova as notas menores que 7.0 e exiba a lista
        Iterator<Double> iterator3 = notas.iterator();
        while(iterator3.hasNext()){
            Double next = iterator3.next();
            if(next < 7.0) iterator3.remove();
        }
        System.out.println("Retirar elementos menores que 7: " + notas.toString());

        System.out.println();

        // 14 - Apague todos os elementos da lista.
        notas.clear();
        System.out.println("Iténs da lista após o clear(): " + notas.toString());

        // 15 - Confira se a lista está vazia.
        System.out.println("A lista está vazia? " + notas.isEmpty());
    }
}

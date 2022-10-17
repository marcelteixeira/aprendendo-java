/*
 * DONE: Exercicio 1 - Criar a classe chamada carro.
 * DONE: Exercicio 2 - Defina 3 atributos para a classe carro.
 * DONE: Exercicio 3
 *          DONE: a) Defina 1 método para calcular o valor total para encher o tanque;
 *          DONE: b) Faça também duas sobrecargas do construtor
 *          DONE: c) Criar os getters e setter dos atributos dessa classe 
 * TODO: Exercicio 4
 *          DONE: a) Crie objetos da classe Carro;
 *          DONE: b) Use os métodos get/set;
 *          DONE: c) Passe uma mensagem para o calculo total para encher o tanque;
*/

package edu.marcelteixeira.java_orientacao_objetos.exercicios;



public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // Testando a classe e os métodos


    // Definindo o construtor e duas sobrecargas
    public Carro(){

    }

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public Carro(String modelo, String cor, int capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }


    // Getters e Setters da Classe
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // Método para calcular o valor gasto para encher o tanque de combustivel desse carro.
    public double totalValorTanque(double valorCombustivel){
        return valorCombustivel * this.capacidadeTanque;
    }



}

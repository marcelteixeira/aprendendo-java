package edu.marcelteixeira.relacoes_heranca_associacao_interface.exercicio_04_interface;

public class Calculadora implements OperacaoMatematica {
    
    @Override
    public void soma(double operando1, double operando2){
        System.out.println(operando1 + operando2);
    }

    @Override
    public void sutracao(double operando1, double operando2){
        System.out.println(operando1 - operando2);
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println(operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println(operando1 + operando2);
    }
}

package edu.marcelteixeira.relacoes_heranca_associacao_interface.exercicio_02_1_heranca;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        
        // Upcast 
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        // Downcast
        Gerente gerente_ = (Gerente) new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        Faxineiro faxineiro_ = (Faxineiro) new Funcionario();

    }
}

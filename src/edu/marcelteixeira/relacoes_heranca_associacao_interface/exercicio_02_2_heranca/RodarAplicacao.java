package edu.marcelteixeira.relacoes_heranca_associacao_interface.exercicio_02_2_heranca;

public class RodarAplicacao {

    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{ new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe : classes){
            classe.metodo1();
        }
    
        System.out.println();
    
        for(ClasseMae classe : classes){
            classe.metodo2();
        }

        System.out.println();

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
    
}

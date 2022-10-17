package edu.marcelteixeira.java_orientacao_objetos.exercicios;

public class RodarExerc {
    public static void main(String[] args) {
        
        // Exerc 4 - a - criar objeto de Carro
        Carro carro1 = new Carro("polo", "preto", 47 );
        // Exerc 4 - b - usar os get/set
        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.5));

        System.out.println();

        Carro carro2 = new Carro("Mercedes-Benz Classe C", "Cinza", 66 );
        
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.5));


    }
}

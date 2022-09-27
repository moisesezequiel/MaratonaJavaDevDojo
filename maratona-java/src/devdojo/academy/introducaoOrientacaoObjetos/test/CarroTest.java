package devdojo.academy.introducaoOrientacaoObjetos.test;

import devdojo.academy.introducaoOrientacaoObjetos.domain.Carro;
import devdojo.academy.introducaoOrientacaoObjetos.domain.Professor;

public class CarroTest {
    public static void main(String[] args) {
        //Crie 2 carros diferentes e imprima seus valores

        Carro carro1 = new Carro();
        carro1.nome = "Uno";
        carro1.modelo ="Sedan";
        carro1.ano = 1999;

        Carro carro2 = new Carro();
        carro2.nome = "Sandero";
        carro2.modelo ="Vermelho";
        carro2.ano = 2005;


        System.out.println("Carro 1  "+ carro1.nome +" "+ carro1.modelo+" "+ carro1.ano+
                " Carro 2  "+ carro2.nome +" "+ carro2.modelo+" "+ carro2.ano);
    }
}

package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Pérola Negra")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponível... ");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar: " + barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Retornando barco alugado... " + barcosDisponiveis);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: " + barcosDisponiveis);
    }
}

package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;


public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio arquivo = new RepositorioArquivo();
        Repositorio bancoDeDados = new RepositorioBancoDeDados();
        Repositorio memoria = new RepositorioMemoria();
        arquivo.salvar();
        bancoDeDados.salvar();
        memoria.salvar();

    }
}

package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Notebook extends Produto {

    public static final double IMPOSTO = 0.25;

    public Notebook(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando taxa do notebook");
        return this.valor * IMPOSTO;
    }

}

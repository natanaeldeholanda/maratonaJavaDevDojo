package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calculaTaxa() {
        System.out.println("Calculando taxa do televisão");
        return this.valor * IMPOSTO;
    }

}

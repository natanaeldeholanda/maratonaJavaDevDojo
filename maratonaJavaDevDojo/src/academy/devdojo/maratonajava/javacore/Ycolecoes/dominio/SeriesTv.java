package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;
import java.util.Objects;

public class SeriesTv implements Comparable<SeriesTv> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public int compareTo(SeriesTv outraSerieTv) {
        //Negativo se o this < outraSerieTv
        //Se this == outraSerieTv return 0;
        //Positivo se this > outraSerieTv
        //Utilizando o if e else
//        if (this.id < outraSerieTv.getId()) {
//            return -1;
//        }
//        else if(this.id.equals(outraSerieTv.getId())){
//            return 0;
//        } else{
//            return 1;
//        }
        //Retornando pelo id
        //return this.id.compareTo(outraSerieTv.getId());

        //Retornando pelo preço
        //return Double.compare(this.preco, outraSerieTv.getPreco());

        //Retornando pela String
        return this.nome.compareTo(outraSerieTv.getNome());
    }

    @Override
    public String toString() {
        return "SeriesTv{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
    //Geração do equals e hashCode para fazer a ordenação das listas via id, nome e preço;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriesTv seriesTv = (SeriesTv) o;
        return Objects.equals(id, seriesTv.id) && Objects.equals(nome, seriesTv.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public SeriesTv(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    public SeriesTv(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

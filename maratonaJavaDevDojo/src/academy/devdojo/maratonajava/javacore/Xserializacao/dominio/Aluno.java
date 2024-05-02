package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 739949230178355185L;
    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo Virado no Jiraya";
    private transient Turma turma;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nome escola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream oss) throws IOException {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) throws IOException {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}


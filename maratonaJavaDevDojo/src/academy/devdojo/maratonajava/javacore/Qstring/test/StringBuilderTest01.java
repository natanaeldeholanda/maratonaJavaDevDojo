package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Natanael de Holanda";
        nome.concat(" fazendo o curso DevDojo");
        nome.substring(0 , 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Natanael de Holanda");
        sb.append(" fazendo o curso DevDojo").append(" Academy");
        sb.reverse(); // inverte a ordem do StringBuilder
        System.out.println(sb);
    }
}

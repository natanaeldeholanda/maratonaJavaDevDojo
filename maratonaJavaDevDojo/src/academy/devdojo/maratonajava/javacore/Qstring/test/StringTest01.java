package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Natanael"; // String constant pool
        String nome2 = "Natanael";
        nome = nome.concat(" Oliveira");
        System.out.println(nome);
        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);
        System.out.println(nome.concat(" Holanda"));
        String nome3 = new String("Slevin"); // 1-> Variável de referência, 2-> Objeto do tipo String, 3-> uma String no pool de Strings
        System.out.println(nome3);
        System.out.println(nome2 == nome3.intern());
    }
}

package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// VÍDEO 132
public class PatternMatcherTest03 {
    public static void main(String[] args) {

        /* \d = Retorna todos os dígitos
           \D = Retorna o que não for dígitos
           \s = Retorna os espaços em branco \t \n \f \r
           \S = Retorna todos os caracteres excluindo os brancos
           \w = Retorna tudo de, a-z A-Z, dígitos e _
           \W = Retorna tudo que não for incluso no \w
           \ [] = Range de caracteres
        */
        String regex = "0[xX] [0-9a-fA-F]";
        //String regex = "[a-zA-Z]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0X109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:   " + texto2);
        System.out.println("Índice:  0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas!");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | " + matcher.group() + "\n");
        }
        // Para declarar um número decimal em java, antes do número inserir 0x ou 0X;
//        int numeroDecimal = 0x59F86A;
//        System.out.println(numeroDecimal);
    }
}

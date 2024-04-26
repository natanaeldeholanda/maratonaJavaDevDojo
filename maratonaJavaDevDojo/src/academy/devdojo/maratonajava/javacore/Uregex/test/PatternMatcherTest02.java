package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// VÍDEO 132
public class PatternMatcherTest02 {
    public static void main(String[] args) {

        /* \d = Retorna todos os dígitos
           \D = Retorna o que não for dígitos
           \s = Retorna os espaços em branco \t \n \f \r
           \S = Retorna todos os caracteres excluindo os brancos
           \w = Retorna tudo de, a-z A-Z, dígitos e _
           \W = Retorna tudo que não for incluso no \w
        */
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "hh2345 h fsd lf vxc_3254Df cLv; w354";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:   " + texto2);
        System.out.println("Índice:  0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas!");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | " + matcher.group() + "\n");
        }
    }
}

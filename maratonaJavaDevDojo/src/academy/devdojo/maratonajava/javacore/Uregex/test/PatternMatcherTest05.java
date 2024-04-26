package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// VÍDEO 132
public class PatternMatcherTest05 {
    public static void main(String[] args) {

        /* \d = Retorna todos os dígitos
           \D = Retorna o que não for dígitos
           \s = Retorna os espaços em branco \t \n \f \r
           \S = Retorna todos os caracteres excluindo os brancos
           \w = Retorna tudo de, a-z A-Z, dígitos e _
           \W = Retorna tudo que não for incluso no \w
           \[] = Range de caracteres
           ? Zero ou uma
           * Zero ou mais
           + uma ou mais
           {n,m} de n até m
           ()
           | o(v|c)o -> ovo ou oco
           $ fim da linha
           . -> 1.3
        */
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@hotmail.com, #@!zoro@mail.com.br, teste@bol.com.br, sakura@uol.com.br";
        System.out.println("Email válido?");
        System.out.println("#@!zoro@mail.com.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:   " + texto);
        System.out.println("Índice:  0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas!");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | " + matcher.group() + "\n");
        }
        // Para declarar um número decimal em java, antes do número inserir 0x ou 0X;
        // int numeroDecimal = 0x59F86A;
        // System.out.println(numeroDecimal);
    }
}

package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;


import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.builder().firstName("Natanael").lastName("Holanda").userName("natanaeldeholanda").email("natanael.holanda@sps.ce.gov.br").build();
        System.out.println(build);
    }
}

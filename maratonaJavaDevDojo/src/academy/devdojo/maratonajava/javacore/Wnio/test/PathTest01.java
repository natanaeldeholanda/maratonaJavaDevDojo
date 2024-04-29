package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/natanael/IdeaProjects/maratonaJavaDevDojo/maratonaJavaDevDojo/file.txt");
        Path p2 = Paths.get("/home/natanael/IdeaProjects/maratonaJavaDevDojo/maratonaJavaDevDojo", "file.txt");
        Path p3 = Paths.get("/home", "/natanael/IdeaProjects/maratonaJavaDevDojo/maratonaJavaDevDojo/file.txt");
        Path p4 = Paths.get("/home", "natanael/", "IdeaProjects/", "maratonaJavaDevDojo/", "maratonaJavaDevDojo/file.txt");
        System.out.println("Pegando de p1 " + p1.getFileName());
        System.out.println("Pegando de p2 " + p2.getFileName());
        System.out.println("Pegando de p3 " + p3.getFileName());
        System.out.println("Pegando de p4 " + p4.getFileName());
    }
}

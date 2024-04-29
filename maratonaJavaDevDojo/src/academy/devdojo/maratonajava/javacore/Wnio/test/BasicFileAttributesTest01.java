package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes, DosFileAttributes, PosixFileAttribures
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");//Criando um novo arquivo na pasta2;
        boolean isCreated = file.createNewFile();//Verificando se o arquivo foi criado;
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());//Modificando a data do arquivo, da forma antiga
        Path path = Paths.get("pasta2/novo_path.txt");//Criando um objeto para criar um novo arquivo na pasta2
        Files.createFile(path);//Criando um novo arquivo na pasta2
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));//Modificando o arquivo
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));


    }
}

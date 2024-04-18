package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        System.out.println("--------------------------");
        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println("--------------------------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("--------------------------");
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}

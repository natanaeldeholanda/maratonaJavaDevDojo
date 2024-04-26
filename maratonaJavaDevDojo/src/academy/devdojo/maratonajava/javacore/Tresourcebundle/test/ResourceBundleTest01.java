package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("oi"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("nome"));
        System.out.println("\nen_US");
        ResourceBundle bundleEnUS = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundleEnUS.getString("hello"));
        System.out.println(bundleEnUS.getString("good.morning"));
        System.out.println(bundleEnUS.getString("name"));

    }
}

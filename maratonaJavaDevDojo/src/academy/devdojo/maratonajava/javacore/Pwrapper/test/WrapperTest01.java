package academy.devdojo.maratonajava.javacore.Pwrapper.test;
import java.util.List;
public class WrapperTest01 {
    public static void main(String[] args) {


        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'C';
        boolean booleanP = false;

        // Como declarar Wrapper -> São relacionados ao polimorfismo.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;
        Integer intW2 = Integer.parseInt("1");//unboxing
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('f'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }

}

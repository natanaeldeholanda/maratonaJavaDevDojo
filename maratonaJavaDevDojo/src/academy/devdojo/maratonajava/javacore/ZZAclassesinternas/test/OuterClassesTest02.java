package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    // Classes Locais, é quando tem uma classe dentro do método
    private String name = "Jiraya";

    void print() {
        String lastName = "Ninja";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        //Única forma de utilizar as classes locais: Criando um objeto e chamando os métodos
        // Criando numa linha só:
        new LocalClass().printLocal();

        // Outra forma de criar objeto e chamar a classe local;
        // LocalClass localClass = new LocalClass();
        // localClass.printLocal();
    }

    public static void main(String[] args) {
    OuterClassesTest02 outer = new OuterClassesTest02();
    outer.print();
    }
}

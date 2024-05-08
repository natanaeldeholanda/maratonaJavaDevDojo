package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";
//Nested => Classes Aninhadas
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //chamando o atributo da classe interna
            System.out.println(OuterClassesTest01.this); //chamando o atributo da classe externa
        }
    }

    public static void main(String[] args) {
    OuterClassesTest01 outerClasses = new OuterClassesTest01();
    Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}

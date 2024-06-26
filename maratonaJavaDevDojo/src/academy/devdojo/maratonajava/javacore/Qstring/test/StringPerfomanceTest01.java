package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio)+ "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String com o StringBuilder " + (fim - inicio)+ "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String com o StringBuffer " + (fim - inicio)+ "ms");

    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder textoStringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            textoStringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer textoStringBuffer = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            textoStringBuffer.append(i);
        }
    }

}

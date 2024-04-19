package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
            System.out.println("Código finalizado!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param a
     * @param b não pode ser dividido por zero!
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não há divisão por zero! ");
        }
        return a / b;
    }
}

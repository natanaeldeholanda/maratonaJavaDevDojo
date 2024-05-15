package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finalizou: %d", Thread.currentThread().getName(), num);
    }
}

public class ExecutorsTest01 {
    public static void main(String[] args) {
        //OBJETIVO: Desacoplar a submissão de tarefas de execução
        System.out.println(Runtime.getRuntime().availableProcessors());
        //ExecutorService executorService = Executors.newFixedThreadPool(2);//Executa com a quantidade de threads definida pelo programador
        //ExecutorService executorService2 = Executors.newSingleThreadExecutor();// Executando em single thread
        ExecutorService executorService3 = Executors.newCachedThreadPool(); // Vai utilizando os threads sobre demanda
        executorService3.execute(new Printer(1)); // Dando o start na execução
        executorService3.execute(new Printer(2)); // Dando o start na execução
        executorService3.execute(new Printer(3)); // Dando o start na execução
        executorService3.execute(new Printer(4)); // Dando o start na execução
        executorService3.shutdown(); //Parando a execução, pode passar o while pra mostrar parando

        System.out.println("Programa finalizado");
    }
}

package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    //Método preço Síncrono
    public double getPriceSync(String storeName) {
        System.out.printf("Getting price sync for store %s\n", storeName);
        return priceGenerator();
    }

    //Método preço Assíncrono
    public Future<Double> getPriceAsyncFuture(String storeName) {
        System.out.printf("Getting price async for store %s\n", storeName);
        return ex.submit(this::priceGenerator);
    }
    public CompletableFuture<Double> getPriceAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting price async for store %s\n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }
public void shutdown(){
        ex.shutdown();
}
    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

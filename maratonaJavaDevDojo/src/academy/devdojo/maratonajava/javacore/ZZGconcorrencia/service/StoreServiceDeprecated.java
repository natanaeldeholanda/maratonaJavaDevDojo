package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    //Método preço Síncrono
    public double getPriceSync(String storeName) {
        System.out.printf("Getting price sync for store %s\n", storeName);
        return priceGenerator();
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

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

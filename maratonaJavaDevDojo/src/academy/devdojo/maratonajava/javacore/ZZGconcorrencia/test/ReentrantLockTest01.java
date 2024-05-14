package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            if (lock.isHeldByCurrentThread()) {
                System.out.printf("Thread %s entrou em uma sessão crítica %n", name);
                System.out.printf("%d Threads esperando na fila %n", lock.getQueueLength());
                System.out.printf("Thread %s vai esperar 2 segundos %n", name);
                Thread.sleep(2000);
                System.out.printf("Thread %s finalizou a espera%n", name);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("Thread1", lock)).start();
        new Thread(new Worker("Thread2", lock)).start();
        new Thread(new Worker("Thread3", lock)).start();
        new Thread(new Worker("Thread4", lock)).start();
        new Thread(new Worker("Thread5", lock)).start();
        new Thread(new Worker("Thread6", lock)).start();
        new Thread(new Worker("Thread7", lock)).start();
        new Thread(new Worker("Thread8", lock)).start();
    }
}

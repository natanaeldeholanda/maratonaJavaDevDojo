package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

/*
Deadlock em Java ocorre quando duas ou mais threads compartilham recursos (como variáveis ou blocos de
código) e dependem umas das outras. Por exemplo, a thread T1 pode depender da thread T2, que por sua vez
depende da T1. Isso acontece por falhas na lógica do programador. Para evitar deadlocks, é importante entender
conceitos como starvation, livelock e race condition. Um exemplo de código que causa deadlock é o seguinte:
 */

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable runnable1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando Lock1");
                System.out.println("Thread 1: Esperando Lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando Lock2");

                }
                System.out.println("Fora do DeadLock");
            }
        };

        Runnable runnable2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando Lock2");
                System.out.println("Thread 2: Esperando Lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Segurando Lock1");

                }
            }
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}

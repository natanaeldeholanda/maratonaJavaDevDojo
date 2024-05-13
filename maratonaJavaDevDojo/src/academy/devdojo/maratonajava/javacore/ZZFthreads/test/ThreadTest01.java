package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    static class ThreadExampleRunnable implements Runnable {
        private final char c;
        public ThreadExampleRunnable(char c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500; i++) {
                System.out.print(c);
                if (i % 100 == 0) {
                    System.out.println();
                }
            }
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {
    //Thread pode ser um objeto e pode ser um processo
    //Daemon x User
    /*
    ESTADOS DAS THREADS -> Waiting/Blocked, New, Runnable, Running, Dead;
     */
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExample.ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExample.ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExample.ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExample.ThreadExampleRunnable('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

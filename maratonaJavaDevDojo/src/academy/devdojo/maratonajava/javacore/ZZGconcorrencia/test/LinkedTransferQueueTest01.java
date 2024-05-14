package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
// LinkedTransferQueue juntou essas 3 classes em uma só
// ConcurrentLinkedQueue, SynchronousQueue LinkedBlockingQueue
        TransferQueue<Object> transferQueue = new LinkedTransferQueue<>();
        System.out.println(transferQueue.add("Natanael"));
        System.out.println(transferQueue.offer("Carneiro"));
        System.out.println(transferQueue.offer("Holanda", 10, TimeUnit.SECONDS));
        transferQueue.put("Oliveira");
        if(transferQueue.hasWaitingConsumer()){
            transferQueue.transfer("Oliveira");
        }
        System.out.println(transferQueue.tryTransfer("Oliveira"));
        System.out.println(transferQueue.tryTransfer("Oliveira", 5, TimeUnit.SECONDS));
        System.out.println(transferQueue.element());
        System.out.println(transferQueue.peek());
        System.out.println(transferQueue.poll());
        System.out.println(transferQueue.take());
        System.out.println(transferQueue.remainingCapacity());
    }
}

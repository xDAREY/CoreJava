package Threads.Synchronization.Example2;

public class Consumer implements Runnable{
    SynchronizedMethod synced;
    public Consumer(SynchronizedMethod synced){
        this.synced = synced;
        new Thread(this, "Consumer").start();

        System.out.println("Get called by the consumer");
    }

    @Override
    public void run() {
        while(true){
            synced.getData();
        }
    }
}

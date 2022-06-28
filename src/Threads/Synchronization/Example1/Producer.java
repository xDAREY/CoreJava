package Threads.Synchronization.Example1;

public class Producer extends Thread{
    SynchronizedMethodE synced;
    public Producer (SynchronizedMethodE synced){
        this.synced = synced;

    }
    @Override
    public void run() {
        int data = 700;
        while(true){
            System.out.println("Put called by Producer");
            synced.putData(data++);
        }
    }
}

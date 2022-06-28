package Threads.Synchronization.Example2;

public class SynchronizedMethod {
    int data;
    boolean flag = false;
    synchronized int getData(){
        if (! flag){
            try{
                wait();
            }catch(InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        System.out.println("Got data: " + data);
        flag = false;
        notify();
        return data;

    }
    synchronized void putData(int data){
        if (flag){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception caught");
            }
        }
        this.data = data;
        flag = true;
        System.out.println("Put data with value: " + data);
        notify();
    }
}

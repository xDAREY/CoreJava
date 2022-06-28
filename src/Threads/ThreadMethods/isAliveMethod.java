package Threads.ThreadMethods;

public class isAliveMethod implements Runnable {
    Thread thread;

    isAliveMethod(){
        thread = new Thread(this, "ChildThread");
        System.out.println("Thread created: " + thread);
        thread.start();
    }


    @Override
    public void run() {
        try{
            for(int i = 1; i <= 5; i++){
                System.out.println(thread + "loop: " + i);
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Thread : " + thread + " interrupted");

        }

    }
}

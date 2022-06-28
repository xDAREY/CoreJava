package Threads.ThreadMethods;

public class isAliveMain {
    public static void main(String[] args) {

        isAliveMethod obj = new isAliveMethod();
        System.out.println(obj.thread + " is alive ? : " + obj.thread.isAlive());

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread loop: " + 1);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread is Interrupted");
        }
        System.out.println(obj.thread + "is alive ? : " + obj.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}

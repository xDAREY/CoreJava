package Threads.ThreadMethods;

public class JoinMethodMain {
    public static void main(String[] args) {

        JoinMethod obj = new JoinMethod();
        System.out.println(obj.thread + " is alive ? : "
                + obj.thread.isAlive());

        try {
            System.out.println("Main Thread waiting for child to finish");
            obj.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread is Interrupted");
        }
        System.out.println(obj.thread + "is alive ? : " + obj.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}


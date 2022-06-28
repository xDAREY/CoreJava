package Threads.ThreadMethods;

public class PriorityMethodMain  {

    public static void main(String[] args) {

    PriorityMethod obj = new PriorityMethod(Thread.NORM_PRIORITY - 2);
    PriorityMethod obj2 = new PriorityMethod(Thread.NORM_PRIORITY + 2);
    PriorityMethod obj3 = new PriorityMethod(Thread.NORM_PRIORITY + 3);

    obj.thread.start();
    obj2.thread.start();
    obj3.thread.start();

    try {
        System.out.println("Main thread waiting for child thread to finish");
        obj.thread.join();
        obj2.thread.join();
        obj3.thread.join();
    }
    catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println(obj.thread + "is alive ? : " + obj.thread.isAlive());
        System.out.println(obj2.thread + "is alive ? : " + obj2.thread.isAlive());
        System.out.println(obj3.thread + "is alive ? : " + obj3.thread.isAlive());
        System.out.println("Main thread is existing");
    }
}
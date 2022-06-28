package Threads;

public class ThreadEx1 implements Runnable{


    @Override
    public void run() {
        System.out.println("My Thread is in runnable start");

        walk();
    }
    public void walk() {
        System.out.println("I'm walking to School!");
    }

    public static void main(String[] args) {
        ThreadEx1 tre = new ThreadEx1();
        Thread m = new Thread(tre);
        m.start();
    }
}

package Generics;

public class GenericDemo {
    public <M> M display (M val){
        return val;
    }

    public static void main(String[] args) {
        GenericDemo Gd = new GenericDemo();

        System.out.println("String: " + Gd.display("John"));
        System.out.println("Integer: " + Gd.display(10));
    }
}

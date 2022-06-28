package TypeCasting;

public class Parent {
    void show() {
        System.out.println("Parent show method is called");
    }
}

class Child extends Parent{
    @Override
    void show() {
        System.out.println("Child show method is called");
    }
}
class main{
    public static void main(String[] args) {
        Parent Obj = new Child();
        Obj.show();
    }
}
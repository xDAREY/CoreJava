package InnerClasses;

public class MethodLocalInnerClass {
    private String X = "my outerclass";

    void display(){
        final String z = "Local variable";
        System.out.println("X: " + X);

        class Inner{
            public void print(){
                System.out.println("Will it print x?" + X);
                System.out.println("Will it print z?" + z);

            }
        }
        Inner run = new Inner();
        run.print();
    }

    public static void main(String[] args) {
        MethodLocalInnerClass Inner = new MethodLocalInnerClass();
        Inner.display();
    }
}

package TypeCasting.Object_Casting;

public class Employee {
    public Employee(){
        System.out.println("Employee");
    }
    public void print(){
        System.out.println("Employee Details");
    }
}

class Manager extends Employee{
    public Manager(){
        System.out.println("Manager");
    }
    public void print(){
        System.out.println("Manager details");
    }
}

class Supervisor extends Employee{
    public Supervisor(){
        System.out.println("Supervisor");
    }
    public void print(){
        System.out.println("Supervisor details");
    }
}
class Test{
    public static void main(String[] args) {
        Employee emp1,emp2;
        Manager m1;
        Supervisor s1;

        emp1 =new Manager();
        emp2 = new Supervisor();
        Employee emp3 = new Manager();

        //CASTING
        m1 = (Manager) emp1;
        s1 = (Supervisor) emp2;

        emp3.print();
    }
}
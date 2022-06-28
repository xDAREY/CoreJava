package InnerClasses;

public class RegularInnerClass {
    private String username;
    private String password;

    class ValidateCredentials{

        public void validate() {

            System.out.println("The Username is " + username);
        }
    }

    public static void main(String[] args) {
            RegularInnerClass run= new RegularInnerClass();
            RegularInnerClass.ValidateCredentials print = run.new ValidateCredentials();
            print.validate();
    }
}

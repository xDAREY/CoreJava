package HomeWork;

import java.util.Scanner;

public class Gift2{

        public static void main(String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number : ");
            n = s.nextInt();
            if(n % 2 == 0)
            {
                System.out.println(n + " is an even number ");
            }
            else
            {
                System.out.println(n+ " is an odd number ");
            }
            if(n % 2 == 0) {
                System.out.println(n + " is not a prime number ");
            }
            else{
                System.out.println(n + " is a prime number ");
            }
        }
    }

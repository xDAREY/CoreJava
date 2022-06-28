package Wildcard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcard {
    public static void main(String[] args) {
        //upper Bounded Integer List
        List< Integer > intList = Arrays.asList(10,20,30,40);
        //printing the sum of integer elements in list
        System.out.println("Total sum is : " + sum(intList));

        //Upper Bounded Double List
        List < Double > doubleList = Arrays.asList(13.2, 15.6, 9.7,22.5);
        //printing the sum of double elements in the list
        System.out.println("Total sum is: " + sum(doubleList));
    }

    private static double sum(List < ?extends Number > myList) {
        double sum = 0.0;
        for ( Number iterator: myList){
            sum = sum + iterator.doubleValue();
        }
        return sum;
    }
}

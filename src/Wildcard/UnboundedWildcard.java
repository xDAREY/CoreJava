package Wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        //Integer List
        List<Integer> intList = Arrays.asList(10,20,30,40);

        //Double list (try float)
        List < Double > doubleList = Arrays.asList(11.5, 13.6,67.8,43.7);

        //String list
        List< String > stringList = Arrays.asList("Dare","Emma");

        printList(intList);
        printList(doubleList);
        printList(stringList);

    }
    public static void printList(List < ?> list) {
        System.out.println(list);
    }
}

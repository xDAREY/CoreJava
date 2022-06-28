package RegularExpression.PatternMethodExamples;

import java.util.regex.Pattern;

public class SplitMethod {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(":");

        //The split method is used to split the given input sequence
        //based on the pattern and (it can also take limit)
        String[] split = pattern.split("one:two:three", 2);

        for(String element: split) {
            System.out.println("Element: " + element);
        }
    }
}

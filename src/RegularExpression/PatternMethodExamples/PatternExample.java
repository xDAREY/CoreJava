package RegularExpression.PatternMethodExamples;

import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("Java", "Java"));

        System.out.println(Pattern.matches("Java", "java"));
    }
}

package RegularExpression.PatternMethodExamples;

import java.util.regex.Pattern;

public class PatternMethod {

    public static void main(String[] args) {

        String s1 = "pattern";
        Pattern myPattern = Pattern.compile(s1);


        //The pattern method is used to return the complied regular expression
        String s2 = myPattern.pattern();
        System.out.println(s2);

    }
}

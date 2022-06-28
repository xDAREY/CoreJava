package RegularExpression.PatternMethodExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {
    public static void main(String[] args) {

        String text = "AA BB CC AA DD BB ABB";
        String patternText = "BB";

        Pattern pattern = Pattern.compile(patternText);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Found at " + matcher.start() + "till" + matcher.end());
        }
    }

}

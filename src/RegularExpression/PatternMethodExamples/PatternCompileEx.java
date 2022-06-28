package RegularExpression.PatternMethodExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompileEx {
    public static void main(String[] args) {

        String text = "Java is cool";
        String patternText = ".*cool";
        Pattern pattern = Pattern.compile(patternText);

        Matcher matcher = pattern.matcher(text);
        boolean isMatched = matcher.matches();

        System.out.println(isMatched);

    }
}

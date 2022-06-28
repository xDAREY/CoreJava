package RegularExpression.PatternMethodExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MachesMethod {
    public static void main(String[] args) {

        //The appendReplace method is used to process the input character sequence-
        //specified in a matcher by adding the input character sequence to the stringBuffer-
        //variable. if the match specified in the pattern is found in the matcher, then it is-
        //replaced by the replacement string,and it is appended to the string buffer variable-
        //further the remaining character sequence is truncated.

        Pattern pattern = Pattern.compile("John");
        Matcher matcher = pattern.matcher("John does this, and John does that");
        StringBuffer s3 = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(s3, "sam");
            System.out.println(s3.toString());
        }
    }
}

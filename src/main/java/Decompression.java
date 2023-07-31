import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Decompression {
    public String decompressText(String reverseText) {
        final String pat1 = "\\d";  //цифра
        Pattern pattern1 = Pattern.compile(pat1);
        final String pat2 = "((\\w(?=\\d))(\\d))"; //символ перед цифрой и цифра
        Pattern pattern2 = Pattern.compile(pat2);
        final String pat3 = "(\\w(?=\\d))"; //символ перед цифрой
        Pattern pattern3 = Pattern.compile(pat3);
        Matcher matcher1 = pattern1.matcher(reverseText);
        Matcher matcher2 = pattern2.matcher(reverseText);
        Matcher matcher3 = pattern3.matcher(reverseText);

        while (matcher1.find()) {
            String s = matcher1.group();
            final int digit = Integer.parseInt(s);

            matcher2.find();
            String s2 = matcher2.group();

            matcher3.find();
            String s3 = matcher3.group();

            reverseText = reverseText.replaceFirst(s2, s3.repeat(digit));
        }
        return reverseText;
    }
}

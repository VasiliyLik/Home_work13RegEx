import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compression {
    public String compressText(String text) {
        final String pat = "(.)\\1+";        //или: String pat = "([a-zA-Z])\\1+";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String sub = matcher.group();
            final int repeats = sub.length();
            text = text.replaceFirst(pat, "$1" + repeats);
        }
        return text;
    }
}

// [^abc]	Any character except a, b, or c (negation)

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^msy]");

        Matcher m = p.matcher("yamsoj");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
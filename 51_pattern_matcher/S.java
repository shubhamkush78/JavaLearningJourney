// . -	Any character (may or may not match line terminators)

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class S {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.b");

        Matcher m = p.matcher("axb a4b a_w aTb a b a\u0012b");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
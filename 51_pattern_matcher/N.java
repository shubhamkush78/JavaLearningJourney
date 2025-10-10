// \s -	A whitespace character: [ \t\n\x0B\f\r]

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");

        Matcher m = p.matcher("Aman is\ta good\nboy\b567");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
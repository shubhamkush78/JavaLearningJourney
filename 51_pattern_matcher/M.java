// \w -	A word character: [a-zA-Z_0-9]

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class M {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w");

        Matcher m = p.matcher("-#Q~5U`@$g_");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
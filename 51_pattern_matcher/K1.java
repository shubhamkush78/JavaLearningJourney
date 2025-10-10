// \d -	A digit: [0-9]

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d");

        Matcher m = p.matcher("aa5xyz9 -32ATY");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}

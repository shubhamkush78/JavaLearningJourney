// \d -	A digit: [0-9]

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d");

        // Matcher m = p.matcher("aa55xyz9 -32ATY567");
        Matcher m = p.matcher("aa55xyz9 -32ATY5678");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}

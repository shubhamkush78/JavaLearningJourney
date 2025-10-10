// [abc] -a, b, or c (simple class)

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class O {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[msy]");

        Matcher m = p.matcher("Aman is a good boy");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
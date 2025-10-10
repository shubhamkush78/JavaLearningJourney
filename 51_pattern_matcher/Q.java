// [a-zA-Z]	a through z or A through Z, inclusive (range)

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Q {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[k-s]");

        Matcher m = p.matcher("mohan is a good bny");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
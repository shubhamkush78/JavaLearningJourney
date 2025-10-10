import java.util.regex.Pattern;
import java.util.regex.Matcher;

class T {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0[xX][0-9a-f]");

        Matcher m = p.matcher("a5 0x2ym_ 780X348fh# y30xk9 _@!0x9at");

        while(m.find()) {
            System.out.println("match: " + m.group() + " - start: " + m.start() + " - end: " + m.end());
        }
    }
}
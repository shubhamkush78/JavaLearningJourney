import java.util.regex.Pattern;
import java.util.regex.Matcher;

class R1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aba");

        Matcher m = p.matcher("abababababa");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
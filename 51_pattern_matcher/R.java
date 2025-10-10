import java.util.regex.Pattern;
import java.util.regex.Matcher;

class R {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aaa");

        Matcher m = p.matcher("aaaaaaaa");

        while(m.find()) {
            System.out.println(m.group() + " Found At: start-> " + m.start() + " end-> " + m.end());
        }
    }
}
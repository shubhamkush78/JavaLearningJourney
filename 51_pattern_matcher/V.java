import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V {
    public static void main(String[] args) {
        // Greedy quantifier
        Pattern p = Pattern.compile(".*xx");

        Matcher m = p.matcher("_1avrxx7yUzxxp_Q123");

        while(m.find()) {
            System.out.println("match: " + m.group() + " - start: " + m.start() + " - end: " + m.end());
        }
    }
}

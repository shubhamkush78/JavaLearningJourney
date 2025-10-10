import java.util.regex.Pattern;
import java.util.regex.Matcher;

class U1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[6-9][0-9]{9}");

        // Matcher m = p.matcher("2345678890");
        // Matcher m = p.matcher("0000000000");
        Matcher m = p.matcher("6000000000");
        // Matcher m = p.matcher("2345678a90");

        if(m.matches()) {
            System.out.println("match: " + m.group() + " - start: " + m.start() + " - end: " + m.end());
        }
    }
}
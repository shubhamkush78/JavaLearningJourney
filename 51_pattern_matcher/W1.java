import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W1 {
    public static void main(String[] args) {
        // Reluctant quantifier
        Pattern p = Pattern.compile("[a-z0-9\\._%+!$&*=^|~#%'`?{}/\\-]+@([a-z0-9\\-]+\\.){1,}([a-z]{2,16})");
        // Pattern p = Pattern.compile("^[a-z0-9\\._%+!$&*=^|~#%'`?{}/\\-]+@([a-z0-9\\-]+\\.){1,}([a-z]{2,16})$");

        Matcher m = p.matcher("mohan$kumar@gmail.comaaa@pqr.com");

        // System.out.println(m.find());

        if(m.find()) {
            System.out.println("match: " + m.group() + " - start: " + m.start() + " - end: " + m.end());
        }
    }
}

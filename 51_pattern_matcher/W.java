import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W {
    public static void main(String[] args) {
        // Reluctant quantifier
        Pattern p = Pattern.compile("[a-z0-9\\._%+!$&*=^|~#%'`?{}/\\-]+@([a-z0-9\\-]+\\.){1,}([a-z]{2,16})");

        // Matcher m = p.matcher("mohan$kumar@gmail.com");
        Matcher m = p.matcher("mohan kumar@gmail.com");

        System.out.println(m.matches());

        if(m.matches()) {
            System.out.println("match: " + m.group() + " - start: " + m.start() + " - end: " + m.end());
        }
    }
}

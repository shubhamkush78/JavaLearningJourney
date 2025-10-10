import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        System.out.println(m.end());
    }    
}


// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.end(Matcher.java:522)
//         at G1.main(G1.java:10)
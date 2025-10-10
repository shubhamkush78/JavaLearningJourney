import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        System.out.println(m.group());
    }    
}


// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at G2.main(G2.java:10)
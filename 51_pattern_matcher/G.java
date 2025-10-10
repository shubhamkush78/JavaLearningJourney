import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        System.out.println(m.start());
    }    
}


// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:450)
//         at G.main(G.java:10)

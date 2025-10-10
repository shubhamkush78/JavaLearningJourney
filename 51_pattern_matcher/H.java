import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
        System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
        System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
        System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
        System.out.println(m.find() + " - " + m.start() + " - " + m.end() + " - " + m.group());
    }    
}



// true - 0 - 2 - om
// true - 8 - 10 - om
// true - 15 - 17 - om
// true - 21 - 23 - om
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:450)
//         at H.main(H.java:14)
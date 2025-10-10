import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        while(m.find()) {
            System.out.println(m);
        }
    }    
}


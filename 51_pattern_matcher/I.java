import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        while(m.find()) {
            System.out.println(m.start() + " # " + m.end() + " # " + m.group());
        }
    }    
}


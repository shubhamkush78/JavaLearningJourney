import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        Matcher m = p.matcher("om aaaa om bbb om cc om");

        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
    }    
}

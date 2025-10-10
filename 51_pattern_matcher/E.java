import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("my friend's name is mohan kumar shukla");

        System.out.println(p);
        System.out.println(p.pattern());
        System.out.println(m.pattern());
    }    
}

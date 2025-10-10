import java.util.regex.*;

class Y {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[0-9]+[f-m]{1}").matcher("jerwQQ567k906h");
        // Matcher m = Pattern.compile("[0-9]+[f-m]{1}").matcher("567kg906h");

        System.out.println(m.find() + " - " + m.group());
        System.out.println(m.find() + " - " + m.group());
        // System.out.println(m.find() + " - " + m.group());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(m.lookingAt() + " - " + m.group());
        System.out.println(m.lookingAt() + " - " + m.group());
        System.out.println(m.lookingAt() + " - " + m.group());
    }
}

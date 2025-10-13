import java.text.DateFormat;
import java.util.Date;

class K {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        System.out.println("~~~~~~~~~~~~~~~~");

        DateFormat a = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat b = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat c = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat e = DateFormat.getDateInstance(DateFormat.DEFAULT);

        System.out.println(a.format(dt));
        System.out.println(b.format(dt));
        System.out.println(c.format(dt));
        System.out.println(d.format(dt));
        System.out.println(e.format(dt));
    }
}

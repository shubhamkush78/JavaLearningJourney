import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class O {
    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        System.out.println("~~~~~~~~~~~~~~~~");

        // Locale y = new Locale("de");
        // Locale y = new Locale("hi", "IN");
        // Locale y = new Locale("zh", "CN");
        Locale y = new Locale("fr", "FR");

        DateFormat a = DateFormat.getDateInstance(DateFormat.FULL, y);
        DateFormat b = DateFormat.getDateInstance(DateFormat.LONG, y);
        DateFormat c = DateFormat.getDateInstance(DateFormat.MEDIUM, y);
        DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT, y);
        DateFormat e = DateFormat.getDateInstance(DateFormat.DEFAULT, y);

        System.out.println(a.format(dt));
        System.out.println(b.format(dt));
        System.out.println(c.format(dt));
        System.out.println(d.format(dt));
        System.out.println(e.format(dt));
    }
}

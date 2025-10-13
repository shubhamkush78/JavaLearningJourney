import java.text.NumberFormat;
import java.util.Locale;

class Q {
    public static void main(String[] args) {
        // NumberFormat f = NumberFormat.getNumberInstance(new Locale("hi", "IN"));
        // NumberFormat f = NumberFormat.getNumberInstance(new Locale("fr", "FR"));
        NumberFormat f = NumberFormat.getNumberInstance(new Locale("de", "DE"));

        int x = 78675645;

        System.out.println(f.format(x));
    }
}

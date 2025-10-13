import java.text.NumberFormat;
import java.util.Locale;

class R {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        // NumberFormat f = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        // NumberFormat f = NumberFormat.getCurrencyInstance(new Locale("de", "DE"));

        int x = 78675645;

        System.out.println(f.format(x));
    }
}

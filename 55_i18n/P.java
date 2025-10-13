import java.text.NumberFormat;

class P {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getNumberInstance();

        int x = 78675645;

        System.out.println(f.format(x));
    }
}

import java.text.NumberFormat;

class T {
    public static void main(String[] args) {
        NumberFormat f1 = NumberFormat.getNumberInstance();
        NumberFormat f2 = NumberFormat.getCurrencyInstance();

        System.out.println(f1.getMaximumFractionDigits());
        System.out.println(f2.getMaximumFractionDigits());
        
        f1.setMaximumFractionDigits(5);
        f2.setMaximumFractionDigits(5);
        
        System.out.println(f1.getMaximumFractionDigits());
        System.out.println(f2.getMaximumFractionDigits());
    }
}

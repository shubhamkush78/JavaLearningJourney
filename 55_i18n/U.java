import java.text.NumberFormat;
import java.text.ParseException;

class U {
    public static void main(String[] args) throws ParseException {
        NumberFormat f = NumberFormat.getNumberInstance();

        String x = "45.5623789";

        Number num = f.parse(x);

        System.out.println(num);
    }    
}

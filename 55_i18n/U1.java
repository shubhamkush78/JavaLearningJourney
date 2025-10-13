import java.text.NumberFormat;

class U1 {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getNumberInstance();

        // float x = 45.5623789f;
        float x = 45.5628789f;

        String num = f.format(x);

        System.out.println(num);
    }    
}

import java.text.SimpleDateFormat;
import java.util.Date;

class J {
    public static void main(String[] args) {
        Date x = new Date();

        System.out.println(x);

        SimpleDateFormat frm = new SimpleDateFormat("dd/MMMM/yyyy 'Happy Hour' HH:mm:ss a");
        // SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");

        String str = frm.format(x);

        System.out.println(str);
    }
}

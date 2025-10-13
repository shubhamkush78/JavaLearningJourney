import java.util.Calendar;
import java.util.Date;

class G {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        
        Date dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cal.add(Calendar.DAY_OF_MONTH, 12);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
    }
}

import java.util.Calendar;
import java.util.Date;

class I {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        
        Date dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // cal.add(Calendar.MONTH, 4);
        cal.set(Calendar.MONTH, 4);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
    }
}

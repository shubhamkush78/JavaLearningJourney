import java.util.Calendar;
import java.util.Date;

class H {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        
        Date dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cal.add(Calendar.YEAR, -2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        dt = new Date(cal.getTimeInMillis());
        System.out.println(dt);
    }
}

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class U {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class k = Class.forName("User");

        Constructor[] arr = k.getDeclaredConstructors();
        
        for(Constructor next : arr) {
            
            if(next.getParameterCount() == 0) {
                // User x = next.newInstance();            
                // User x = (User)next.newInstance();            
                Object x = next.newInstance();            
                System.out.println(x);
            }
        }
    }
}

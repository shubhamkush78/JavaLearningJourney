import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class U1 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class k = Class.forName("User");

        Constructor<User>[] arr = k.getDeclaredConstructors();
        
        for(Constructor<User> next : arr) {
            
            if(next.getParameterCount() == 0) {
                User x = next.newInstance();            
                System.out.println(x);
            }
        }
    }
}

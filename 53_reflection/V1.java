import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class V1 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class k = Class.forName("User");

        Constructor<User>[] arr = k.getDeclaredConstructors();
        
        for(Constructor<User> next : arr) {            
            if(next.getParameterCount() == 3) {
                next.setAccessible(true);
                User x = next.newInstance(12, "yamraj", java.sql.Date.valueOf("2222-01-01"));            
                System.out.println(x);
            }
        }
    }
}
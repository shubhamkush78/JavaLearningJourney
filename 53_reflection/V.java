import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class V {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class k = Class.forName("User");

        Constructor<User>[] arr = k.getDeclaredConstructors();
        
        for(Constructor<User> next : arr) {            
            if(next.getParameterCount() == 3) {
                User x = next.newInstance(12, "yamraj", java.sql.Date.valueOf("2222-01-01"));            
                System.out.println(x);
            }
        }
    }
}


// Exception in thread "main" java.lang.IllegalAccessException: class V cannot access a member of class User with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:489)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at V.main(V.java:12)
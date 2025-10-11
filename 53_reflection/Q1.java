import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Q1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        User a = new User("Yudhishthir");
        User b = new User("Arjun");
        User c = new User("Bheem");

        // a.signin("yam@gmail.com", "999999");

        Class k = c.getClass();

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods) 
            if(method.getName().equals("signin"))
                method.invoke(c, "om@gmail.com", "123456");
    }    
}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class P1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        User a = new User("Yudhishthir");
        User b = new User("Arjun");
        User c = new User("Bheem");

        // b.signout();

        Class k = User.class;

        Method[] methods = k.getDeclaredMethods();

        // System.out.println(methods[2].getName());

        for(Method next : methods) 
            if(next.getName().equals("signout"))
                next.invoke(a);
        
    }    
}

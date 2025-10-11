import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class O2 {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods)
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName());
    }    
}

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class O4 {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods) {
            System.out.print(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + "(");

            Class[] types = method.getParameterTypes();

            for(Class type : types)
                System.out.print(type.getName()+", ");

            System.out.println(")");
        }
    }    
}

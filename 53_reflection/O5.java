import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class O5 {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods) {
            System.out.print(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + "(");

            Class[] types = method.getParameterTypes();

            for(Class type : types)
                System.out.print(type.getName()+", ");

            System.out.print(")");

            Class[] throwsExceptions = method.getExceptionTypes();
            if(throwsExceptions.length != 0)
                System.out.print(" throws ");
                
            for(Class next : throwsExceptions)
                System.out.print(next.getName() + ", ");
            
            System.out.println();
        }
    }    
}

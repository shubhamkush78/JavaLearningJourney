import java.lang.reflect.Method;

class O1 {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods)
            System.out.println(method.getReturnType().getName() + " " + method.getName());
    }    
}

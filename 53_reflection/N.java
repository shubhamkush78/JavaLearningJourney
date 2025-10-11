import java.lang.reflect.Method;

class N {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods)
            System.out.println(method);
    }    
}

import java.lang.reflect.Method;

class M {
    public static void main(String[] args) {
        Class klass = User.class;

        Method[] methods = klass.getMethods();

        for(Method method : methods)
            System.out.println(method);
    }    
}

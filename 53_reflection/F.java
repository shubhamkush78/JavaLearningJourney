import java.lang.reflect.Modifier;

class F {
    public static void main(String[] args) {
        Class klass = User.class;

        Class kl = klass.getSuperclass();

        System.out.println(kl.getName());
    }    
}



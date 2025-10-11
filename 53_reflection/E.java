import java.lang.reflect.Modifier;

class E {
    public static void main(String[] args) {
        Class klass = User.class;

        int key = klass.getModifiers();

        // System.out.println(key);
        System.out.println(Modifier.toString(key));
    }    
}



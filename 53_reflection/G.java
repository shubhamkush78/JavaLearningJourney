import java.lang.reflect.Modifier;

class G {
    public static void main(String[] args) {
        Class klass = User.class;

        Class[] kls = klass.getInterfaces();

        for(Class kl : kls)
            System.out.println(kl.getName());
    }    
}



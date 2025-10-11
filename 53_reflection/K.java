import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class K {
    public static void main(String[] args) {
        Class klass = User.class;

        Field[] fields = klass.getDeclaredFields();

        for(Field fl : fields)
            System.out.println(Modifier.toString(fl.getModifiers()) + " - " + fl.getType().getName() + " - " + fl.getName());
    }    
}



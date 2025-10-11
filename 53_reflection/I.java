import java.lang.reflect.Field;

class I {
    public static void main(String[] args) {
        Class klass = User.class;

        Field[] fields = klass.getDeclaredFields();

        for(Field fl : fields)
            System.out.println(fl);
    }    
}



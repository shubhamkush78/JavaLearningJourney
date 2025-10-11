import java.lang.reflect.Field;

class H {
    public static void main(String[] args) {
        Class klass = User.class;

        Field[] fields = klass.getFields();

        for(Field fl : fields)
            System.out.println(fl);
    }    
}



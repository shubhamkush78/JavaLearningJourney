import java.lang.reflect.*;
import java.sql.Date;

class L {
    public static void main(String[] args) throws IllegalAccessException {
        User u1 = new User(12, "golu", Date.valueOf("2002-10-03"), "9999999999", "778867676756");
        User u2 = new User(99, "yamraj", Date.valueOf("1111-11-11"), "0000000000", "000000000000");
        
        Class klass = User.class;

        Field[] fields = klass.getFields();

        // for(Field field : fields)
        //     System.out.println(field.get(u1));
        
        System.out.println(fields[1].get(u1));
        System.out.println(fields[1].get(u2));
    }
}

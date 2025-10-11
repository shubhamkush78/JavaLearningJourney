import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class T1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("User");

        Constructor[] arr = k.getDeclaredConstructors();
        
        for(Constructor next : arr)
            System.out.println(Modifier.toString(next.getModifiers()) + " " + next.getName());
    }
}

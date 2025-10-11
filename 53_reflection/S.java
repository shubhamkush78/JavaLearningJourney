import java.lang.reflect.Constructor;

class S {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("User");

        Constructor[] arr = k.getDeclaredConstructors();
        
        for(Constructor next : arr)
            System.out.println(next);
    }
}

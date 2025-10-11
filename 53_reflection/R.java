import java.lang.reflect.Constructor;

class R {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("User");

        Constructor[] arr = k.getConstructors();
        
        for(Constructor next : arr)
            System.out.println(next);
    }
}

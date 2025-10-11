import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class W {
    public static void main(String[] args) {
        Method[] ar = BB.class.getDeclaredMethods();

        for(Method n : ar) {
            if(n.getName().equals("pro")) {
                Annotation[] arr = n.getDeclaredAnnotations();
                System.out.println(arr[0]);
            }
        }
    
    }    
}

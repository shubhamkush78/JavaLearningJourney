import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface YY {

}

@YY
class E1 {

}

class W extends E1 {
    public static void main(String[] args) {
        Class k = W.class;

        Annotation[] arr = k.getAnnotations();

        System.out.println("---------start ------");
        for(Annotation next  : arr) {
            System.out.println(next);
        }
        System.out.println("---------end ------");
    }    
}

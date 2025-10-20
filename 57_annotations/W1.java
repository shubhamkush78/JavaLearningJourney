import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface YY1 {

}

@YY1
class H1 {

}

class W1 extends H1 {
    public static void main(String[] args) {
        Class k = W1.class;

        Annotation[] arr = k.getAnnotations();

        System.out.println("---------start ------");
        for(Annotation next  : arr) {
            System.out.println(next);
        }
        System.out.println("---------end ------");
    }    
}

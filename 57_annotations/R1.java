import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@interface OO {

}

@Retention(RetentionPolicy.RUNTIME)
@interface PP {

}

@Retention(RetentionPolicy.RUNTIME)
@interface QQ {

}

@OO
@PP
@QQ
class R1 {
    public static void main(String[] args) {
        Class k = R1.class;

        Annotation[] arr = k.getAnnotations();

        for(Annotation next : arr){
            System.out.println(next);
        }
    }    
}

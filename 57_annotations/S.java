import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RR {

}

@Retention(RetentionPolicy.RUNTIME)
@interface SS {

}

@Retention(RetentionPolicy.RUNTIME)
@interface TT {

}

@SS
class S {
    public static void main(String[] args) {
        SS y = S.class.getAnnotation(SS.class);        
        TT x = S.class.getAnnotation(TT.class);
        
        System.out.println(y);
        System.out.println(x);
    }
}
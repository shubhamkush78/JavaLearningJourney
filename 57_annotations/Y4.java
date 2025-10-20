import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface DDD {
    String name() default "mahendra";
    int age() default 21;
}

@DDD
class Y4 {
    public static void main(String[] args) {
        Class k = Y4.class;

        DDD a = (DDD)k.getAnnotation(DDD.class);

        System.out.println(a.name());
        System.out.println(a.age());
    }
}

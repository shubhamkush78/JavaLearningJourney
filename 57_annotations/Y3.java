import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CCC {
    String name();
    int age();
}

@CCC(name="yam",age=1000)
class Y3 {
    public static void main(String[] args) {
        Class k = Y3.class;

        CCC a = (CCC)k.getAnnotation(CCC.class);

        System.out.println(a.name());
        System.out.println(a.age());
    }
}

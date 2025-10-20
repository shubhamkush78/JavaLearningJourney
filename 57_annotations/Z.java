import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface EEE {
    String[] value();
}

@EEE({"golu","raju","prabhu"})
class Z {
    public static void main(String[] args) {
        EEE w = (EEE)Z.class.getAnnotation(EEE.class);

        String[] arr = w.value();

        for(String next : arr) {
            System.out.println(next);
        }
    }
}

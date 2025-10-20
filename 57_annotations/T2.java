import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
@interface WW {

}

@WW
class T2 {
    @WW
    int a = 9;    

    @WW
    void pro() {

    }

    @WW
    T2() {

    }
}

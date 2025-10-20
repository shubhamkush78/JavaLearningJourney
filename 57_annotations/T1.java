import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)
@interface VV {

}

@VV
class T1 {
    @VV
    int a = 9;    

    @VV
    void pro() {

    }

    @VV
    T1() {

    }
}

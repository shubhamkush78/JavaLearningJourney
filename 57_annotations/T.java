import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// @Target(ElementType.TYPE)
@interface UU {

}

@UU
class T {
    @UU
    int a = 9;    

    @UU
    void pro() {

    }

    @UU
    T() {

    }
}

import java.lang.annotation.Target;
// import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

// @Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
@Target({METHOD,CONSTRUCTOR})
@interface XX {

}

@XX
class V {
    @XX
    int y = 78;       
    
    @XX
    V() {

    }

    @XX
    void pro() {

    }
}

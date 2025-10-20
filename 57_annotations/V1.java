import java.lang.annotation.Target;

// import static java.lang.annotation.ElementType.METHOD;
// import static java.lang.annotation.ElementType.CONSTRUCTOR;

import static java.lang.annotation.ElementType.*;

// @Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
@Target({METHOD,CONSTRUCTOR,FIELD,TYPE})
@interface XX1 {

}

@XX1
class V1 {
    @XX1
    int y = 78;       
    
    @XX1
    V1() {

    }

    @XX1
    void pro() {

    }
}

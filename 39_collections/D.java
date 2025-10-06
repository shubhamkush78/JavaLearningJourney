import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

class D {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x instanceof Object);
        System.out.println(x instanceof Iterable);
        System.out.println(x instanceof Collection);
        System.out.println(x instanceof List);
        System.out.println(x instanceof RandomAccess);
    }
}

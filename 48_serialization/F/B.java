import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        X x = (X)(new ObjectInputStream(new FileInputStream("yam.txt")).readObject());

        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.c);
        System.out.println(x.d);
        System.out.println(x.e);
    }    
}

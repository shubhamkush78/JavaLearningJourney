import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) throws IOException {
        new ObjectOutputStream(new FileOutputStream("yam.txt")).writeObject(new X());
    }    
}

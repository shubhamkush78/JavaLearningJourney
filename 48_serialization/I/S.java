import java.io.*;

class S {
    public static void main(String[] args) throws IOException {
        B m = new B();
        m.a = 99;
        m.b = "yam";

        new ObjectOutputStream(new FileOutputStream("pqr.txt")).writeObject(m);
    }
}

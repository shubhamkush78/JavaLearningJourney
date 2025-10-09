import java.io.*;

class X {
    public static void main(String[] args) throws IOException {
        A m = new A();
        m.a = 99;
        m.b = "yam";

        new ObjectOutputStream(new FileOutputStream("mno.txt")).writeObject(m);
    }
}

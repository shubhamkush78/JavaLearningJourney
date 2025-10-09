import java.io.*;

class P {
    public static void main(String[] args) throws IOException {
        D m = new D();
        m.a = 99;
        m.b = "yam";
        m.x = 2;
        m.y = "aaa";
        
        new ObjectOutputStream(new FileOutputStream("pqr.txt")).writeObject(m);
    }
}

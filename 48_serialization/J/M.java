import java.io.*;

class M {
    public static void main(String[] args) throws IOException {
        B m = new B();
        m.a = 99;
        m.b = "yam";
        m.x = 2;
        m.y = "aaa";
        
        new ObjectOutputStream(new FileOutputStream("mno.txt")).writeObject(m);
    }
}

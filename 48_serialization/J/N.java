import java.io.*;

class N {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        B n = (B)(new ObjectInputStream(new FileInputStream("mno.txt"))).readObject();

        System.out.println(n.a);
        System.out.println(n.b);
        System.out.println(n.x);
        System.out.println(n.y);
    }
}

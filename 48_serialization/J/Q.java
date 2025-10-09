import java.io.*;

class Q {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        D n = (D)(new ObjectInputStream(new FileInputStream("pqr.txt"))).readObject();

        System.out.println(n.a);
        System.out.println(n.b);
        System.out.println(n.x);
        System.out.println(n.y);
    }
}

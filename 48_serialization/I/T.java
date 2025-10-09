import java.io.*;

class T {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        B p = (B)(new ObjectInputStream(new FileInputStream("pqr.txt"))).readObject();
        
        System.out.println(p.a);
        System.out.println(p.b);        
    }    
}

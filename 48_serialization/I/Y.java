import java.io.*;

class Y {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        A p = (A)(new ObjectInputStream(new FileInputStream("mno.txt"))).readObject();
        
        System.out.println(p.a);
        System.out.println(p.b);        
    }    
}

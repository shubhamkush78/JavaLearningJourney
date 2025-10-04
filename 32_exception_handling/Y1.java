import java.io.FileNotFoundException;
import java.io.FileReader;

class Y1 {
    static void aaa() throws FileNotFoundException   {
        System.out.println("T");
        bbb();
    }
    
    static void bbb() throws FileNotFoundException {
        System.out.println("R");
        ccc();
    }
        
    static void ccc() throws FileNotFoundException {
        System.out.println("G");
        
        FileReader fr = new FileReader("abc.txt");
    }   

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("E");
        aaa();
        System.out.println("H");
    }
}
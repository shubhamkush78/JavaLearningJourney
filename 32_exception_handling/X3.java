import java.io.FileNotFoundException;
import java.io.FileReader;

class X3 {
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
}
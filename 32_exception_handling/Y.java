import java.io.FileNotFoundException;
import java.io.FileReader;

class Y {
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

    public static void main(String[] args) {
        aaa();
    }
}


// Y.java:22: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         aaa();
//            ^
// 1 error
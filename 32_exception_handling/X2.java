import java.io.FileNotFoundException;
import java.io.FileReader;

class X2 {
    static void aaa() {
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

// X2.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         bbb();
//            ^
// 1 error
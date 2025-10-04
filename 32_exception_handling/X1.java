import java.io.FileNotFoundException;
import java.io.FileReader;

class X1 {
    static void aaa() {
        System.out.println("T");
        bbb();
    }
    
    static void bbb() {
        System.out.println("R");
        ccc();
    }
        
    static void ccc() throws FileNotFoundException {
        System.out.println("G");
        
        FileReader fr = new FileReader("abc.txt");
    }   
}


// X1.java:12: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         ccc();
//            ^
// 1 error
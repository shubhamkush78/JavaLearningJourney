import java.io.FileReader;

class X {
    static void aaa() {
        System.out.println("T");
        bbb();
    }
    
    static void bbb() {
        System.out.println("R");
        ccc();
    }
        
    static void ccc() {
        System.out.println("G");
        
        FileReader fr = new FileReader("abc.txt");
    }   
}


// X.java:17: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error

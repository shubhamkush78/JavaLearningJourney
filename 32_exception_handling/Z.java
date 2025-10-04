import java.io.FileNotFoundException;
import java.io.FileReader;

class Z {
    static void aaa() {
        System.out.println("T");
        try {
            bbb();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
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
        System.out.println("E");
        aaa();
        System.out.println("H");
    }
}
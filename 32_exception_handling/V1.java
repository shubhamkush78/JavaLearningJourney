import java.io.FileReader;
import java.io.FileNotFoundException;

class V1 {
    public static void main(String[] args) throws FileNotFoundException 
    {
        System.out.println(1);
        
        FileReader fr = new FileReader("abc.txt");
        
        System.out.println(2);
    }    
}
import java.io.FileReader;
import java.io.FileNotFoundException;


class W2 {
    W2() // throws FileNotFoundException 
    {
        FileReader fr = new FileReader("abc.txt");
    }   
}
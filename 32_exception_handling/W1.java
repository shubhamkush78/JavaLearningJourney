import java.io.FileReader;
import java.io.FileNotFoundException;


class W1 {
    W1() {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }   
}
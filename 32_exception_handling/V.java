import java.io.FileReader;
import java.io.FileNotFoundException;

class V {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            FileReader fr = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}
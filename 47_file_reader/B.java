import java.io.FileReader;
import java.io.FileNotFoundException;

class B {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sohan.txt");

            // file sohan.txt exists...
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
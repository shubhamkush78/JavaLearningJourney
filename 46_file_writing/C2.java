import java.io.FileWriter;
import java.io.IOException;

class C2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:/Ratan.txt"); // check read-only in properties...
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

class B1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:/AAA/Golu.txt");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

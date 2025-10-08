import java.io.FileWriter;
import java.io.IOException;

class B {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Golu.txt");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

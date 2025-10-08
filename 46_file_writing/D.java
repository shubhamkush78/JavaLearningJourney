import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class D {
    public static void main(String[] args) throws IOException {
        File file = new File("yamraj.txt");

        FileWriter fw = new FileWriter(file);
    }
}

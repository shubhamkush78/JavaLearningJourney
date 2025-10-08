import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class H {
    public static void main(String[] args) throws IOException {
        File file = new File("raju.txt");

        FileWriter fw = new FileWriter(file);

        // BufferedWriter bw = new BufferedWriter("raju.txt");
        // BufferedWriter bw = new BufferedWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("MOhan ");
        bw.write("is ");
        bw.write("a ");
        bw.write("good ");
        bw.write("boy.");

        bw.flush();
        bw.close();
    }
}

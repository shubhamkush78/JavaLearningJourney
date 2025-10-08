import java.io.PrintWriter;
import java.io.FileNotFoundException;

class J {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("chotabheem.txt");

            // pw.write(true);
            pw.print(true);

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

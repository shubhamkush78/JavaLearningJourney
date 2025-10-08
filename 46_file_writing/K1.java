import java.io.PrintWriter;
import java.io.FileNotFoundException;

class K1 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("yug.txt");

            pw.println("I am learning GO lang");
            pw.println("a very easy language to start with");
            pw.println("I strongly recommend you to go for Go");

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

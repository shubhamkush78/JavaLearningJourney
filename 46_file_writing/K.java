import java.io.PrintWriter;
import java.io.FileNotFoundException;

class K {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("yug.txt");

            pw.print("I am learning GO lang");
            pw.print("a very easy language to start with");
            pw.print("I strongly recommend you to go for Go");

            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

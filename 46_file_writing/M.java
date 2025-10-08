import java.io.PrintWriter;
import java.io.FileNotFoundException;

class M {
    public static void main(String[] args) {
        try {
            PrintWriter x = new PrintWriter("vikram.txt");
            x.format("My Name is %s, and my age is %d and my marks: %.2f", "Nagendra", 22, 78.9f);
  
            x.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

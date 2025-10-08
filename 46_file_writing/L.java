import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class L {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("chotabheem.txt");

            ArrayList<String> list = new ArrayList<>();
            
            list.add("golu");
            list.add("bablu");
            list.add("dholu");

            pw.print(list);
            
            pw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

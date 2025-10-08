import java.io.IOException;
import java.io.FileWriter;

class F {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yamraj.txt");

        fw.write('Z');
        fw.flush();

        char[] arr = {'a','b','c','d','e'};

        fw.write(arr);

        fw.flush();
        fw.close();
    }    
}

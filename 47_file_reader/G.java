import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class G {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("raju.txt");

        BufferedReader br = new BufferedReader(fr);

        String str = null;

        while((str = br.readLine()) != null)
            System.out.println(str);

        br.close();
    }
}

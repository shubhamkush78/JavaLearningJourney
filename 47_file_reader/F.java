import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class F {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("raju.txt");

        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine() + " -1-");
        System.out.println(br.readLine() + " -2-");
        System.out.println(br.readLine() + " -3-");
        System.out.println(br.readLine() + " -4-");
        System.out.println(br.readLine() + " -5-");
        System.out.println(br.readLine() + " -6-");
        System.out.println(br.readLine() + " -7-");
        System.out.println(br.readLine() + " -8-");
        System.out.println(br.readLine() + " -9-");
        System.out.println(br.readLine() + " -10-");

        br.close();
    }
}

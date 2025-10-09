import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class C {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("raju.txt");

            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());

            fr.close();
        } catch(FileNotFoundException e1) {
            e1.printStackTrace();
        } catch(IOException e2) {
            e2.printStackTrace();
        }
    }

}
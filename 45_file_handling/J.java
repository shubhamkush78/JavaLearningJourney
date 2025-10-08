import java.io.File;
import java.io.IOException;

class J {
    public static void main(String[] args)  {
        File file = new File("Nobita.txt");

        System.out.println(file.exists());

        try {
            file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.exists());
    }    
}

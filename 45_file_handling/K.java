import java.io.File;
import java.io.IOException;

class K {
    public static void main(String[] args)  {
        File file = new File("Gian.mp3");

        System.out.println(file.exists());

        try {
            System.out.println(file.createNewFile());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

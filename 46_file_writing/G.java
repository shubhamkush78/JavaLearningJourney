import java.io.FileWriter;
import java.io.IOException;

class G {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yamraj.txt");

        fw.write("mohan is a good boy... he is my best friend... he is a singer.. right now he is singing");

        fw.close();
    }    
}

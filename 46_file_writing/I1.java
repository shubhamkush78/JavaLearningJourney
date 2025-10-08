import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class I1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("yamraj.txt")));
        
        bw.write("I am learning GO lang\n");
        bw.write("a very easy language to start with\n");
        bw.write("I strongly recommend you to go for Go");

        bw.close();
    }    
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class I {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("yam.txt")));
        
        bw.write("I am learning GO lang");
        bw.write("a very easy language to start with");
        bw.write("I strongly recommend you to go for Go");

        bw.close();
    }    
}

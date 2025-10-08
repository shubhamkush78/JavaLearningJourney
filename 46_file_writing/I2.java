import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class I2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("prajapati.txt")));
        
        bw.write("I am learning GO lang");
        bw.newLine();
        bw.write("a very easy language to start with");
        bw.newLine();
        bw.write("I strongly recommend you to go for Go");
        bw.newLine();
        bw.write("the target time is 5 days");

        bw.close();
    }    
}

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class E {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("raju.txt");

        char[] arr = new char[5];


        while(fr.read(arr) != -1) {
            for(int i=0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }

            System.out.println();
        } 

        fr.close();        
    }
}

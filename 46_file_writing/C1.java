import java.io.FileWriter;
import java.io.IOException;

class C1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:/Windows/System32/Golu.txt");  // inside system directory
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}



// java.io.FileNotFoundException: C:\Windows\System32\Golu.txt (Access is denied)
//         at java.base/java.io.FileOutputStream.open0(Native Method)
//         at java.base/java.io.FileOutputStream.open(FileOutputStream.java:293)
//         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:235)
//         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
//         at java.base/java.io.FileWriter.<init>(FileWriter.java:66)
//         at C1.main(C1.java:7)

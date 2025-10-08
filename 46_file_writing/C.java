import java.io.FileWriter;
import java.io.IOException;

class C {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:/Golu.txt");  //here Golu.txt is a folder...
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


// java.io.FileNotFoundException: D:\Golu.txt (Access is denied)
//         at java.base/java.io.FileOutputStream.open0(Native Method)
//         at java.base/java.io.FileOutputStream.open(FileOutputStream.java:293)
//         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:235)
//         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
//         at java.base/java.io.FileWriter.<init>(FileWriter.java:66)
//         at C.main(C.java:7)
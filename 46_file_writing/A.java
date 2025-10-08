import java.io.FileWriter;

class A {
    public static void main(String[] args) {
        FileWriter x;

        new FileWriter("");  // can throw IOException ... 
    }
}


// A.java:7: error: unreported exception IOException; must be caught or declared to be thrown
//         new FileWriter("");  // can throw IOException ...
//         ^
// 1 error

import java.io.FileReader;

class W {
    W() {
        FileReader fr = new FileReader("abc.txt");
    }   
}

// W.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error

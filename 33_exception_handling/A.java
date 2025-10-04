import java.io.FileReader;
import java.io.FileNotFoundException;

class AA {
    AA() {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class A extends AA {
    public static void main(String[] args) {
       System.out.println(5); 
    }
}

// A.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error

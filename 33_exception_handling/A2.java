import java.io.FileReader;
import java.io.FileNotFoundException;


class AA2 {
    AA2() throws FileNotFoundException {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class A2 extends AA2 {
    A2() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       System.out.println(5); 
    }
}

// A2.java:14: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//     A2() {
//          ^
// 1 error
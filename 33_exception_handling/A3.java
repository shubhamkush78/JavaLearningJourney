import java.io.FileReader;
import java.io.FileNotFoundException;


class AA3 {
    AA3() throws FileNotFoundException {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class A3 extends AA3 {
    A3() {
        super();
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       System.out.println(5); 
    }
}

// A3.java:15: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error
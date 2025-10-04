import java.io.FileReader;
import java.io.FileNotFoundException;


class AA1 {
    AA1() throws FileNotFoundException {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class A1 extends AA1 {
    public static void main(String[] args) {
       System.out.println(5); 
    }
}


// A1.java:13: error: unreported exception FileNotFoundException in default constructor
// class A1 extends AA1 {
// ^
// 1 error

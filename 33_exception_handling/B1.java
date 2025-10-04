import java.io.FileReader;
import java.io.FileNotFoundException;

class AB1 {
    AB1() throws FileNotFoundException {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class B1 extends AB1 {
    B1() throws FileNotFoundException {
        super();   
    }
    public static void main(String[] args) {
       System.out.println(5); 
    }
}
import java.io.FileReader;
import java.io.FileNotFoundException;

class AB {
    AB() throws FileNotFoundException {
        System.out.println(7);
        FileReader fr = new FileReader("abc.txt");
        System.out.println(2);      
    }
}

class B extends AB {
    B() {
        try{
            super();
        } catch(FileNotFoundException e) {
            System.out.println("Hello");
        }   
    }
    public static void main(String[] args) {
       System.out.println(5); 
    }
}

// B.java:15: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error

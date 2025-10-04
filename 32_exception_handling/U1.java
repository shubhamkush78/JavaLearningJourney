import java.io.FileReader;

class U1 {
    public static void main(String[] args) {
        System.out.println(1);

        FileReader fr = new FileReader("abc.txt");

        System.out.println(2);
    }    
}


// U1.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
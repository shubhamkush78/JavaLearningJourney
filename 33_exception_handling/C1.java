import java.io.FileNotFoundException;

class C1 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            System.out.println('A');
        } catch(FileNotFoundException e) {
            System.out.println("Hello");
        }        

        System.out.println(2);
    }    
}

import java.io.File;

class L {
    public static void main(String[] args) {
        File file = new File("Kaliya");

        System.out.println(file.exists());

        System.out.println(file.mkdir());

        System.out.println(file.exists());
    }    
}

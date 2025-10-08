import java.io.File;

class N {
    public static void main(String[] args) {
        File file = new File("Bheem/Raju");

        System.out.println(file.exists());

        System.out.println(file.mkdir());

        System.out.println(file.exists());
    }    
}

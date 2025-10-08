import java.io.File;

class N1 {
    public static void main(String[] args) {
        File file = new File("Bheem/Raju/Kaju");

        System.out.println(file.exists());

        System.out.println(file.mkdirs());

        System.out.println(file.exists());
    }    
}

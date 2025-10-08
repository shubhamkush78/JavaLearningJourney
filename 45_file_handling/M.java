import java.io.File;

class M {
    public static void main(String[] args) {
        File file = new File("Kaliya/Dholu");

        System.out.println(file.exists());

        System.out.println(file.mkdir());

        System.out.println(file.exists());
    }    
}

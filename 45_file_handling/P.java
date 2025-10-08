import java.io.File;

class P {
    public static void main(String[] args) {
        File file = new File("Kaliya");

        File x = new File("Shinchan");

        System.out.println(file.renameTo(x));
    }
}

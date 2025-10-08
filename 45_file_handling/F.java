import java.io.File;

class F {
    public static void main(String[] args) {
        File file = new File("D:/javaprac/45_file_handling");
        
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
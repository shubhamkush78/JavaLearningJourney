import java.io.File;

class G {
    public static void main(String[] args) {
        File file = new File("D:/javaprac/45_file_handling/A.java");
        
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
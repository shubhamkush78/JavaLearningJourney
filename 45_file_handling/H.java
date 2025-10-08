import java.io.File;

class H {
    public static void main(String[] args) {
        //absolute paths...
        File file1 = new File("D:/javaprac/45_file_handling/Golu.java");
        File file2 = new File("D:/javaprac/45_file_handling/H.java");
        
        System.out.println(file1.exists());
        System.out.println(file2.exists());
    }
}
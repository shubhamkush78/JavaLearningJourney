import java.io.File;

class I {
    public static void main(String[] args) {
        //relative paths...
        File file1 = new File("Golu.java");  
        File file2 = new File("H.java");
        
        System.out.println(file2.exists());
        System.out.println(file1.exists());
    }
}
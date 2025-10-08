import java.io.File;

class Q {
    public static void main(String[] args) {
        File file = new File("D:/ChotaBheem");
        File x = new File("D:/javaprac/45_file_handling/ChotaBheem");

        System.out.println(file.renameTo(x));
    }    
}

import java.io.File;

class R1 {
    public static void main(String[] args) {
        File file = new File("ChotaBheem");
        
        System.out.println(file);

        File x = file.getAbsoluteFile();
        System.out.println("## " + x + " ##");
    }
}

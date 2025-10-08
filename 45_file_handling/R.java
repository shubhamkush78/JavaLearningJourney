import java.io.File;

class R {
    public static void main(String[] args) {
        File file = new File("ChotaBheem");
        
        System.out.println(file);
        System.out.println("~~ " + file.getAbsolutePath() + " ~~");
    }
}

import java.io.File;

class U {
    public static void main(String[] args) {
        File file = new File("D:/javaprac");

        String[] paths = file.list();

        for(String str : paths) 
            System.out.println(str);
    }    
}

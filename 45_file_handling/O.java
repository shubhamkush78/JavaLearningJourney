import java.io.File;
import java.util.Scanner;

class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many folders you wan tto create: ");
        int n = sc.nextInt();

        sc.close();

        for(int i=1;i<=n;i++) {
            File file = new File("Bheem/Raju/Kaju/a"+i);
            file.mkdir();
        }
    }
}

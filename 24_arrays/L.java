import java.util.Scanner;

class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];

        // x[0] = 34;
        // x[1] = 78;
        // x[2] = 9;

        for(int i = 0; i < x.length;  i++) {
            System.out.println(x[i]);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        
        for(int i = 0; i < x.length;  i++) {
            System.out.print("Enter " + (i+1) +"th number: ");
            x[i] = sc.nextInt();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        for(int i = 0; i < x.length;  i++) {
            System.out.println(x[i]);
        }

        sc.close();
    }    
}

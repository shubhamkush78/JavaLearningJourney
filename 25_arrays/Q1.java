import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        int[] x = {67, 34, 90, 78, 12, 90, 23, 19, 90, 120};

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int searchKey = sc.nextInt();


        for(int i=0;i<x.length;i++) {
            if(x[i] == searchKey) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        
        sc.close();
    }    
}

import java.util.Scanner;

class Q {
    public static void main(String[] args) {
        int[] x = {67, 34, 78, 12, 90, 23, 19, 120};

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int searchKey = sc.nextInt();

        boolean flag = false;
        for(int next : x) {
            System.out.println(next);
            if(next == searchKey) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
        
        sc.close();
    }    
}

public class N {
    public static void main(String[] args) {
        Thread t = new Thread();
        
        // t.setPriority(5); // priority range: 1-10
        t.setPriority(12);
    }
}


// IllegalArgumentException
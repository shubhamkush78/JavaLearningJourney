class G {
    public static void main(String[] args) {
        Bus x = new Bus();

        if(x instanceof Car) {
            System.out.println("Bus IS-A Car");
        } else {
            System.out.println("Bus IS-NOT-A Car");
        }
    }    
}



// G.java:5: error: incompatible types: Bus cannot be converted to Car
//         if(x instanceof Car) {
//            ^
// 1 error
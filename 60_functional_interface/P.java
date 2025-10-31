@FunctionalInterface
interface CCC {
    void pro(int a, int b);
}

// class X3 implements CC {
//     public void pro(int a, int b) {
//         System.out.println(a + " - " + b);
//     }
// }

// (a,b) -> System.out.println(a + " - " + b);


class P {
    public static void main(String[] args) {
        CCC x = (a,b) -> System.out.println(a + " - " + b);

        x.pro(2, 9);
    }    
}

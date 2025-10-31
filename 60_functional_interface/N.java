@FunctionalInterface
interface BBB {
    void pro(int a);
}

// class X3 implements BBB {
//     public void pro(int a) {
//         System.out.println(a);
//     }
// }

// a -> System.out.println(a);


class N {
    public static void main(String[] args) {
        BBB x = a -> System.out.println(a);

        x.pro(777);
    }    
}

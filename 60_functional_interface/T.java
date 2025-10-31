@FunctionalInterface
interface EEE {
    int add(int a, int b);
}

// class X5 implements EE {
//     public int add(int a, int b) {
//         int sum = 0;
//         sum = a + b;
//         return sum;
//     }
// }

// (a,b) -> {
//     int sum = 0;
//     sum = a + b;
//     return sum;
// };

class T {
    public static void main(String[] args) {
        EEE x = (a,b) -> {
            int sum = 0;
            sum = a + b;
            return sum;
        };

        System.out.println(x.add(7, 11));
    }
}

@FunctionalInterface
interface EEEE {
    int add(int a, int b);
}

class U {
    public static void main(String[] args) {
        EEEE x = (a,b) -> {
            int sum = 0;
            sum = a + b;
            return sum;
        };

        // int res = x.add(22, 11);

        String res = x.add(22, 11);

        // int res = x.add(2.2f, 11);   // not ok
        
        System.out.println(res);
    }
}

class A {
    public static void main(String[] args) {
        int[][][] x = new int[3][2][4];

        System.out.println(x);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println("~~~~~~#~~~~~~~~~~");
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println("~~~~~~#~~~~~~~~~~");
        System.out.println(x[2][0]);
        System.out.println(x[2][1]);
        System.out.println("~~~~~~#~~~~~~~~~~");
        System.out.println(x[0][0][0]);
        System.out.println(x[0][0][1]);
        System.out.println(x[0][0][2]);
        System.out.println(x[0][0][3]);
    }
}
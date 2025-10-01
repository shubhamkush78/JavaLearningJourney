class B {
    public static void main(String[] args) {
        int[][][] x = new int[3][2][4];

        System.out.println(x + " - " + x.length);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(x[0] + " - " + x[0].length);
        System.out.println(x[1] + " - " + x[1].length);
        System.out.println(x[2] + " - " + x[2].length);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(x[0][0] + " - " + x[0][0].length);
        System.out.println(x[0][1] + " - " + x[0][1].length);
        System.out.println("~~~~~~#~~~~~~~~~~");
        System.out.println(x[1][0] + " - " + x[1][0].length);
        System.out.println(x[1][1] + " - " + x[1][1].length);
        System.out.println("~~~~~~#~~~~~~~~~~");
        System.out.println(x[2][0] + " - " + x[2][0].length);
        System.out.println(x[2][1] + " - " + x[2][1].length);
        System.out.println("~~~~~~#~~~~~~~~~~");
    }
}
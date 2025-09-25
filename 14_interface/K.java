interface DD {
    int s = 77;
}

class K {
    public static void main(String[] args) {
        System.out.println(DD.s);

        DD.s = 99;

        System.out.println(DD.s);
    }
}



// K.java:9: error: cannot assign a value to final variable s
//         DD.s = 99;
//           ^
// 1 error
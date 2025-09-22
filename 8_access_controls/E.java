class F {
    private int y = 99;
}

class E {
    public static void main(String[] args) {
        F x = new F();

        System.out.println(x.y);
    }    
}


// E.java:9: error: y has private access in F
//         System.out.println(x.y);
//                             ^
// 1 error

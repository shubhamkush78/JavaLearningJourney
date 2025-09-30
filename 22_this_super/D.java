class YY {
    static int x = 222;    
}

class D extends YY {
    static int x = 22;

    public static void main(String[] args) {        
        int x = 2;

        System.out.println(x);        
        System.out.println(this.x);        
        System.out.println(super.x);        
    }
}


// D.java:12: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this.x);
//                            ^
// D.java:13: error: non-static variable super cannot be referenced from a static context
//         System.out.println(super.x);
//                            ^
// 2 errors

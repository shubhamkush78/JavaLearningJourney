class C {
    public static void main(String[] args) {
        int a = 23;
        int b = 23;


        System.out.println(a == b);
        System.out.println(a.equals(b));
    }    
}


// C.java:8: error: int cannot be dereferenced
//         System.out.println(a.equals(b));
//                             ^
// 1 error
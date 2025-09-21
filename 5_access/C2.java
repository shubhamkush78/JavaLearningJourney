class C2 {
    public static void main(String[] args) {
        System.out.println(D2.x);

    }
}

class D2 {
    int x = 122;
}


// C2.java:3: error: non-static variable x cannot 
// be referenced from a static context
//         System.out.println(D2.x);
//                              ^
// 1 error
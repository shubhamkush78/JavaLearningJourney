class Q1 {    
    
    {
        System.out.println(x);
    }

    int x = 99; 

    public static void main(String[] args) {
        Q1 x = new Q1();
    }
}


// Q1.java:4: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error
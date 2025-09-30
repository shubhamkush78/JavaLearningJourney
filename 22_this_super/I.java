class I {
    I() {
        System.out.println(i);
    }   
    
    public static void main(String[] args) {
        I i = new I();

        System.out.println(i);
    }
}



// I.java:3: error: cannot find symbol
//         System.out.println(i);
//                            ^
//   symbol:   variable i
//   location: class I
// 1 error
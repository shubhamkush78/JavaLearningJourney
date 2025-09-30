class F1 {
    
}

class P extends F1 {

    int y = 999;

    public static void main(String[] args) {
        P x = new P();

        x.info();
    }   
    
    void info() {
        System.out.println(this.y);
        System.out.println(super.y);
    }
}


// P.java:17: error: cannot find symbol
//         System.out.println(super.y);
//                                 ^
//   symbol: variable y
// 1 error

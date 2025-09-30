class N {
    public static void main(String[] args) {
        N x = new N();

        x.pro();
        System.out.println(x);
    }   
    
    void pro() {
        System.out.println(this);
        System.out.println(super);
    }
}


// N.java:11: error: '.' expected
//         System.out.println(super);
//                                 ^
// 1 error
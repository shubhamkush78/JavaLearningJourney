class E {
    //inner class X is an instance level member class
    class X {

    }   
    
    public static void main(String[] args) {
        new X();
        // this.new X();
    }
}


// E.java:8: error: non-static variable this cannot be referenced from a static context
//         new X();
//         ^
// 1 error
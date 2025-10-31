@FunctionalInterface
interface AA {
    void pro();
}

class I {
    public static void main(String[] args) {
        AA x = new AA();

        x.pro();
    }    
}


// I.java:8: error: AA is abstract; cannot be instantiated
//         AA x = new AA();
//                ^
// 1 error
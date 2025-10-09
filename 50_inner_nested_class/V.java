interface XX {
    void pro();
}

class V {
    public static void main(String[] args) {
        XX t = new XX();
    }    
}


// V.java:7: error: XX is abstract; cannot be instantiated
//         XX t = new XX();
//                ^
// 1 error
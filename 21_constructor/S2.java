class AA2 {
    private AA2() {
        
    }
}

class S2 extends AA2 {
    S2() {
        super();
    }
}


// S2.java:9: error: AA2() has private access in AA2
//         super();
//         ^
// 1 error

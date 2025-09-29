// Also check S2.java

class MNO {
    private MNO() {

    }
}

class Y  {
    public static void main(String[] args) {
        MNO x = new MNO();
    }
}



// Y.java:11: error: MNO() has private access in MNO
//         MNO x = new MNO();
//                 ^
// 1 error
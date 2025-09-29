
class T2 {
    T2(int x) {
        System.out.println(1);
    }
}

class M2 extends T2 {
    M2() {
        super();
    }

    public static void main(String[] args) {
        System.out.println(5);
        
        System.out.println(9);
    }
}





// M2.java:10: error: constructor T2 in class T2 cannot be applied to given types;
//         super();
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
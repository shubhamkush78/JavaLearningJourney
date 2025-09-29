
class T1 {
    T1(int x) {
        System.out.println(1);
    }
}

class M1 extends T1 {
    M1() {

    }

    public static void main(String[] args) {
        System.out.println(5);
        
        System.out.println(9);
    }
}




// M1.java:9: error: constructor T1 in class T1 cannot be applied to given types;
//     M1() {
//          ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
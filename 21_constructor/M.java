
class T {
    T(int x) {
        System.out.println(1);
    }
}

class M extends T {
    public static void main(String[] args) {
        System.out.println(5);
        
        System.out.println(9);
    }
}


// M.java:8: error: constructor T in class T cannot be applied to given types;
// class M extends T {
// ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
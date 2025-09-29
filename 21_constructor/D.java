class D {
    D(int x) {

    }

    public static void main(String[] args) {
        D d = new D();
    }
}



// D.java:7: error: constructor D in class D cannot be applied to given types;
//         D d = new D();
//               ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
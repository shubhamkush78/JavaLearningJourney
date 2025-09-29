
class N {
    N() {
        super(2);
        System.out.println(9);
    }

    public static void main(String[] args) {
        System.out.println(2);
        N x = new N();
        System.out.println(5);
    }
}


// N.java:4: error: constructor Object in class Object cannot be applied to given types;
//         super(2);
//         ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error

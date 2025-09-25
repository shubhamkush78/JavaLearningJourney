package x;

import y.B;

class A implements B {
    /*public*/ void pro() {
        System.out.println("Hiiiii ..... !!");
    }
    public static void main(String[] args) {
        A a = new A();

        a.pro();
    }
}



// x\A.java:6: error: pro() in A cannot implement pro() in B
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error
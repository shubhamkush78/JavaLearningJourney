class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.y);
    }
}

// class B {
//     int y = 33;
// }



// A.java:3: error: cannot find symbol
//         B x = new B();
//         ^
//   symbol:   class B
//   location: class A
// A.java:3: error: cannot find symbol
//         B x = new B();
//                   ^
//   symbol:   class B
//   location: class A
// 2 errors
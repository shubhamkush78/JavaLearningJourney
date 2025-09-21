class E1 {
    public static void main(String[] args) {
        E1 x = new E1();

        x.pro();
    }
}

class F1 {
    void pro() {
        System.out.println("Hi Ji!!");
    }
}


// E1.java:5: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type E1
// 1 error
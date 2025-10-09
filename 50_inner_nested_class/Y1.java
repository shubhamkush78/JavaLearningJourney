class MM {
    void pro() {
        System.out.println("ghatotkachh");
    }
}

class Y1 {
    MM x = new MM() {
        void pro() {
            System.out.println("barbareek");
        }

        void info() {
            System.out.println("hidimb");
        }
    };        

    public static void main(String[] args) {
        Y1 a = new Y1();

        a.x.pro();
        a.x.info();
    }
}


// Y1.java:22: error: cannot find symbol
//         a.x.info();
//            ^
//   symbol:   method info()
//   location: variable x of type MM
// 1 error
class X1 {
    X1() {
        System.out.println("X1 Constructor");
    }
}

class X2 extends X1 {
    X2() {
        System.out.println("X2 Constructor");
    }
}

class X3 extends X2 {
    X3() {
        System.out.println("X3 Constructor");
    }
}

class G {
    public static void main(String[] args) {
        System.out.println("main start");
        X3 a = new X3();
        System.out.println("main end");
    }
}

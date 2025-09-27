// Multi-Level Inheritance ....

class X1 {
    void walk() {
        System.out.println("I can walk");
    }
}

class X2 extends X1 {
    void talk() {
        System.out.println("I can talk");
    }
}

class X3 extends X2 {
    void laugh() {
        System.out.println("I can laugh");
    }
}

class J extends X3 {
    public static void main(String[] args) {
        J j = new J();

        j.walk();
        j.talk();
        j.laugh();
    }
}

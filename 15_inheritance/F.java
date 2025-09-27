class AA {
    void walk() {
        System.out.println("I can Walk");
    }
}

class BB extends AA {
    void talk() {
        System.out.println("I can Talk");
    }
}

class CC extends BB {
    void laugh() {
        System.out.println("I can Laugh");
    }
}

class F extends CC {
    public static void main(String[] args) {
        F x = new F();
        x.walk();
        x.talk();
        x.laugh();
    }
}

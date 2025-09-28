class S {
    void pro() {
        System.out.println("Hi");
    }
}

class P extends S {
    // void pro() {
    //     System.out.println("Helloooo!");
    // }
}

class F1 {
    public static void main(String[] args) {
        S x = new P();

        x.pro();
    }
}

class SS {
    int y = 1111;
}

class TT extends SS {
    int y = 111;
}

class H extends TT {
    int y = 11;

    public static void main(String[] args) {
        H h = new H();

        h.pro();
    }

    void pro() {
        int y = 1;

        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
        System.out.println(super.super.y);
    }
}



// H.java:24: error: <identifier> expected
//         System.out.println(super.super.y);
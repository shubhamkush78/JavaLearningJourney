class C {
    int y = 88;

    class D extends C {
        void pro() {
            System.out.println(y);
            System.out.println(this.y);
            System.out.println(super.y);
            System.out.println(C.this.y);
        }
    }
}

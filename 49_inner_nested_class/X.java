class X {
    class C1 {
        class C2 {
            class C3 {
                class C4 {

                }
            }
        }
    }    

    public static void main(String[] args) {
        X.C1.C2.C3.C4 x = new X().new C1().new C2().new C3().new C4();

        System.out.println(x);
    }
}

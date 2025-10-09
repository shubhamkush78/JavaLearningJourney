class Y {
    int t = 10000;
    class A {
        int t = 1000;
        class B {
            int t = 100;
            class C {
                int t = 10;
                class D {
                    int t = 1;
                    void pro() {
                        System.out.println(t);
                        System.out.println(C.this.t);
                        System.out.println(B.this.t);
                        System.out.println(A.this.t);
                        System.out.println(Y.this.t);
                    }
                }
            }
        }
    }    

    public static void main(String[] args) {
        Y.A.B.C.D x = new Y().new A().new B().new C().new D();

        x.pro();
    }
}

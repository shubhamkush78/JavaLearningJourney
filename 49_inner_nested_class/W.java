class W {
    class B1 {
        class B2 {
            class B3 {
                class B4 {

                }
            }
        }
    }    

    public static void main(String[] args) {
        W w = new W();

        B1 a = w.new B1();

        B1.B2 b = a.new B2();

        B1.B2.B3 c = b.new B3();

        B1.B2.B3.B4 d = c.new B4();

        System.out.println(w);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


// W@3af49f1c
// W$B1@19469ea2
// W$B1$B2@13221655
// W$B1$B2$B3@2f2c9b19
// W$B1$B2$B3$B4@31befd9f


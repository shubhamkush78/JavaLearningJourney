@FunctionalInterface
interface AAAA {
    void pro();
}

// class X1 implements AAA {
//     public void pro() {
//         System.out.println("Namaste Ji");
//     }
// }

class K {
    public static void main(String[] args) {
        AAAA x = new AAAA() {
            public void pro() {
                System.out.println("Vadakkam Ji");
            }
        };

        x.pro();
    }    
}
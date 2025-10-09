class EE {
    class X {
        private void pro() {
            System.out.println("Namaskaram");
        }
    }
}

class M {
    public static void main(String[] args) {
        EE c = new EE();
        EE.X x = c.new X();

        x.pro();
    }    
}


// M.java:14: error: pro() has private access in EE.X
//         x.pro();
//          ^
// 1 error
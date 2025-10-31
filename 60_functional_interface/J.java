@FunctionalInterface
interface AAA {
    void pro();
}

class X1 implements AAA {
    public void pro() {
        System.out.println("Namaste Ji");
    }
}

class J {
    public static void main(String[] args) {
        AAA x = new X1();

        x.pro();
    }    
}
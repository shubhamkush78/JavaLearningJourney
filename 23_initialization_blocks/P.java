class EE {
    {        System.out.println("L");  }

    EE() {
        System.out.println("A");
    }

    static {   System.out.println("D");  }
}

class P extends EE {
    P() {
        System.out.println("G");
    }

    {  System.out.println("T"); }

    static {   System.out.println("E");  }

    public static void main(String[] args) {
        System.out.println("Y");
        P a = new P();
        System.out.println("R");
    }    
}

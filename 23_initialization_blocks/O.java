class DD {
    {        System.out.println("S");  }

    DD() {
        System.out.println("M");
    }
}

class O extends DD {
    O() {
        System.out.println("J");
    }

    {  System.out.println("K"); }

    public static void main(String[] args) {
        System.out.println("Y");
        O a = new O();
        System.out.println("R");
    }    
}

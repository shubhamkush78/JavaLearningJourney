class T4 {
    T4(int x, float y) {        
        System.out.println("2");
    }
}

class O extends T4 {
    
    O() {
        // super(2, 3f);
        System.out.println("8");
    }  

    public static void main(String[] args) {
        System.out.println("3");
        O x = new O();
        System.out.println("1");
    }
}

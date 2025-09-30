class E {
    E() {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("~~~E()~~~~");
    }   
    
    E(int y) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("~~~E(int)~~~~");
    }

    E(int x, float y) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("~~~E(int,float)~~~~");
    }

    public static void main(String[] args) {
        E a1 = new E();
        E a2 = new E(12);
        E a3 = new E(34, 6.78f);
    }
}

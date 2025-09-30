class E1 {
    {
        System.out.println("A-");
        System.out.println("B-");
        System.out.println("C-");
        System.out.println("D-");
    }

    E1() {
        // System.out.println("A");
        // System.out.println("B");
        // System.out.println("C");
        // System.out.println("D");
        System.out.println("~~~E1()~~~~");
    }   
    
    E1(int y) {
        // System.out.println("A");
        // System.out.println("B");
        // System.out.println("C");
        // System.out.println("D");
        System.out.println("~~~E1(int)~~~~");
    }

    E1(int x, float y) {
        // System.out.println("A");
        // System.out.println("B");
        // System.out.println("C");
        // System.out.println("D");
        System.out.println("~~~E1(int,float)~~~~");
    }

    public static void main(String[] args) {
        E1 a1 = new E1();
        E1 a2 = new E1(12);
        E1 a3 = new E1(34, 6.78f);
    }
}

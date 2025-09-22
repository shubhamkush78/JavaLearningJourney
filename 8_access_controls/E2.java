class F2 {
    private int y = 45;

    int pro() {
        return y;
    }
}

class E2 {
    public static void main(String[] args) {
        F2 x = new F2();
        
        int a = x.pro();

        System.out.println(a);
    }    
}
class C1 {
    public static void main(String[] args) {
        MNO x = new MNO();
        MNO y = new MNO();
        
        System.out.println("C1.main() - x: " + x);
        System.out.println("C1.main() - y: " + y);
        x.pro(y);
    }    
}

class MNO {
    void pro(MNO m) {
        System.out.println("MNO.pro() - x: " + this);
        System.out.println("MNO.pro(): - y: " + m);
    }
}

class G1 {
    public static void main(String[] args) {
        G1 g = new G1();
        
        g.pro();

        // info();
    }   
    
    void pro() {
        info();
        this.info();
    }

    void info() {
        System.out.println("hello");
    }
}

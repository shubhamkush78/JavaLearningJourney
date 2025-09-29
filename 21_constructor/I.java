class I {
    int count = 0;
    
    I() {
        count++;
    }

    public static void main(String[] args) {
        I a1 = new I();    
        I a2 = new I();    
        I a3 = new I();    
        I a4 = new I();
        
        System.out.println(a1.count);
        System.out.println(a2.count);
        System.out.println(a3.count);
        System.out.println(a4.count);
    }    
}

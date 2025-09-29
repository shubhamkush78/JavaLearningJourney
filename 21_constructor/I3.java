class I3 {
    static int count = 0;
    
    I3() {
        count++;
    }

    public static void main(String[] args) {
        I3 a1 = new I3();    
        I3 a2 = new I3();  
        I3 a3 = new I3();    
        I3 a4 = new I3();
        I3 a5 = new I3();
        
        System.out.println(a1.count);
        System.out.println(a2.count);
        System.out.println(a3.count);
        System.out.println(a4.count);
        System.out.println(a5.count);
        System.out.println(count);
    }    
}

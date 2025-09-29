class I1 {
    static int count = 0;
    
    I1() {
        count++;
    }

    public static void main(String[] args) {
        I1 a1 = new I1(); 
        System.out.println(a1.count);   
        I1 a2 = new I1();    
        System.out.println(a2.count);
        I1 a3 = new I1();  
        System.out.println(a3.count);  
        I1 a4 = new I1();        
        System.out.println(a4.count);
    }    
}

class I2 {
    static int count = 0;
    
    I2() {
        count++;
    }

    public static void main(String[] args) {
        I2 a1 = new I2();    
        I2 a2 = new I2();    
        I2 a3 = new I2();    
        I2 a4 = new I2();
        I2 a5 = new I2();
        
        System.out.println(a1.count);
        System.out.println(a2.count);
        System.out.println(a3.count);
        System.out.println(a4.count);
        System.out.println(a5.count);
    }    
}

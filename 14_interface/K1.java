class EE {
    int f = 89;
}

class K1 {
    public static void main(String[] args) {
        EE x = new EE();
        System.out.println(x.f);  
        x.f = 999;     
        System.out.println(x.f);       
    }    
}

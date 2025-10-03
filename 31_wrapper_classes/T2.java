class T2 {
    public static void main(String[] args) {
        byte y = 23;

        pro(y); //boxing(autoboxing)
    }   
    
    static void pro(Integer x) {
        System.out.println(x);
    }
}

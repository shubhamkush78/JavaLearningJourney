class T1 {
    public static void main(String[] args) {
        int y = 23;

        pro(y); //boxing(autoboxing)
    }   
    
    static void pro(Integer x) {
        System.out.println(x);
    }
}

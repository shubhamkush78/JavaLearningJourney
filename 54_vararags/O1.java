class O1 {
    public static void main(String[] args) {
        // pro(54);
        // pro(54, 11, 22, 33, 44, 55);
        pro(54, 11);
    }   
    
    static void pro(int count, int... values) {
        System.out.println(count);

        for(int next : values)
            System.out.println(next + " -");
    }
}

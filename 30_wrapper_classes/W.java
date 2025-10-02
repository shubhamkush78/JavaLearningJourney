class W {
    public static void main(String[] args) {
        byte a = 23;
        
        Byte x = new Byte(a);
        Byte y = a;

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }    
}

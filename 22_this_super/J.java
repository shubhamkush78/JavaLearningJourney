class J {
    J() {
        //super();
        //magic code
        System.out.println(this + " ~~");
    }   
    
    public static void main(String[] args) {
        J i1 = new J();
        System.out.println(i1);

        J i2 = new J();        
        System.out.println(i2);
    }
}
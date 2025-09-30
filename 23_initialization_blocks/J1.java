class J1 {
    int y = 78;

    {
        int y = 34;
        System.out.println(y);
        System.out.println(this.y);
    }    

    public static void main(String[] args) {
        J1 x = new J1();
    }
}

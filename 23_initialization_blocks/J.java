class J {
    int y = 78;

    {
        int y = 34;
        System.out.println(y);
    }    

    public static void main(String[] args) {
        J x = new J();
    }
}

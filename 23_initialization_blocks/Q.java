class Q {
    int x = 99;   
    
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Q x = new Q();
    }
}

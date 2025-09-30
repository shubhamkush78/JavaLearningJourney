class K {

    {        
        System.out.println(this + " --- 5");
        
    }    

    K() {
        System.out.println(this + " --- 2");
    }

    public static void main(String[] args) {
        K x = new K();
        System.out.println(x + " --- 7");
    }
}

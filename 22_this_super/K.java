class K {
    int y = 555;

    K() {
        System.out.println(this.y);
    }   
    
    public static void main(String[] args) {
        K k = new K();

        System.out.println(k.y);
    }
}

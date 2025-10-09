class H {
    class Y {

    }

    public static void main(String[] args) {
        H h = new H();
        Y y = h.new Y();

        //or

        Y z = new H().new Y();
    }    
}

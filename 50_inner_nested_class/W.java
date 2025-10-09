interface WW {
    void pro();
}

class W {
    // Anonymous Inner Class...
    WW w = new WW() {
        public void pro() {
            System.out.println("Dasvidaniya");
        }
    };

    public static void main(String[] args) {
        W x = new W();
        x.w.pro();
    }
}
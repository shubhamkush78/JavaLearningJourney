interface XX1 {
    void pro();
}

class V1 {
    public static void main(String[] args) {
        //Method Local Anonymous Inner Class...

        XX1 t = new XX1() {
            public void pro() {
                System.out.println("Namaskaram");
            }
        };

        t.pro();
    }    
}

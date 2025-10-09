interface ZZ {
    void pro();
}

class YY implements ZZ {
    public void pro() {
        System.out.println("Hiiiiii .....!!");
    }
}

class U {
    public static void main(String[] args) {
        YY y = new YY();

        y.pro();
    }    
}

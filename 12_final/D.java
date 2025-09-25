final class W {

}

class D {
    public static void main(String[] args) {
        W x = D.pro();

        System.out.println(x);
    }
    
    static W pro() {
        W w = new W();
        System.out.println(w);

        return w;
    }
}

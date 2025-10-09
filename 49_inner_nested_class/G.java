class G {
    int y = 99;

    public static void main(String[] args) {
        G g = new G();
        g.pro();

        // System.out.println(y);
    }    
    
    void pro() {
        System.out.println(y);
        System.out.println(this.y);
    }
}

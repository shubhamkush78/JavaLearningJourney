class Z extends GG {
    public static void main(String[] args) {
        Z z = new Z();
        HH h = z.new HH();

        System.out.println(h.y);
    }    
}

class GG {
    class HH {
        int y = 3;
    }
}

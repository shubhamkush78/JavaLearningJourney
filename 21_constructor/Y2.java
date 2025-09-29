class MNO {
    private MNO() {

    }

    static MNO createInstance() {
        // essential code..
        MNO w = new MNO();
        return w;    
    }
}

class Y2  {
    public static void main(String[] args) {
        
        // MNO x = new MNO();

        MNO w = MNO.createInstance();
        MNO v = MNO.createInstance();

        System.out.println(w);
        System.out.println(v);
    }
}
class MNO {
    private MNO() {

    }

    MNO createInstance() {
        MNO w = new MNO();
        return w;    
    }
}

class Y  {
    public static void main(String[] args) {
        // MNO x = new MNO();

        MNO w = createInstance();
    }
}
class AA {
    int y = 90;
}

class J2 extends AA {
    int y = 78;

    {
        int y = 34;
        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }    

    public static void main(String[] args) {
        J2 x = new J2();
    }
}

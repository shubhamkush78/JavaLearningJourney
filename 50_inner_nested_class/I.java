class CC {
    static class DD {
        int e = 56;
    }
}

class I {
    public static void main(String[] args) {
        CC.DD x = new CC.DD();

        System.out.println(x.e);
    }    
}

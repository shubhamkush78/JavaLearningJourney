class BB {
    {
        System.out.println("T");
    }
}

class M extends BB {
    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        System.out.println("R");
        M x = new M();
        System.out.println("J");
    }    
}

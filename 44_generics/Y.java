class Y {
    public static void main(String[] args) {
        AAA.pro(new Car("maruti"));
        AAA.pro(new Scooter("bajaj"));
        AAA.pro(new Bus("tata"));
    }    
}

class AAA {
    static <Z> void pro(Z x) {
        System.out.println(x + " ----");
    }
}

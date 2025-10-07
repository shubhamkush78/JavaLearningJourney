class Z {
    public static void main(String[] args) {
        BBB x = new BBB(new Car("honda"));
        BBB y = new BBB(new Bus("volvo"));
        BBB z = new BBB(new Scooter("yamaha"));
    }    
}

class BBB {
    <ZZ> BBB(ZZ w) {
        System.out.println(w);
    }
}

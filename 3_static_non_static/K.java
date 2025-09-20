class Circle {
    static double pi = 3.14; // static variable
    int radius; // instance variable

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 100;

        c1.calcArea();
        c2.calcArea();
    }

     static void calcArea() {
        System.out.println(pi * radius * radius); 
    }
}

// K.java:17: error: non-static variable radius cannot be referenced 
// from a static context
//         System.out.println(pi * radius * radius); 
//                                 ^
// K.java:17: error: non-static variable radius cannot be referenced 
// from a static context
//         System.out.println(pi * radius * radius); 
//                                          ^
// 2 errors
// Note: static method can access only static data.
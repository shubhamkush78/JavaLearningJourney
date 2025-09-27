// Constructor Overloading....

class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        this.length = length;
    }
    
    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class N3 {
    public static void main(String[] args) {
        Shape x = new Shape(100);
        System.out.println(x.length);
        System.out.println(x.width);
        System.out.println(x.height);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        Shape y = new Shape(100, 50);
        System.out.println(y.length);
        System.out.println(y.width);
        System.out.println(y.height);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Shape z = new Shape(100, 50, 70);
        System.out.println(z.length);
        System.out.println(z.width);
        System.out.println(z.height);
    }
}

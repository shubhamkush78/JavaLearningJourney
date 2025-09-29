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

class P2 {
    public static void main(String[] args) {
        Shape a = new Shape(45);
        System.out.println("Length: " + a.length + ", Width: " + a.width + ", Height: " + a.height);
        
        Shape b = new Shape(45, 52);
        System.out.println("Length: " + b.length + ", Width: " + b.width + ", Height: " + b.height);
        
        Shape c = new Shape(45, 52, 23);
        System.out.println("Length: " + c.length + ", Width: " + c.width + ", Height: " + c.height);
    }
}

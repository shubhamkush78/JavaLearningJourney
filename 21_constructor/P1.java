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
}

class P1 {
    public static void main(String[] args) {
        Shape a = new Shape(45);
        System.out.println("Length: " + a.length + ", Width: " + a.width + ", Height: " + a.height);
        
        Shape b = new Shape(45, 52);
        System.out.println("Length: " + b.length + ", Width: " + b.width + ", Height: " + b.height);
    }
}

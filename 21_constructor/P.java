class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        this.length = length;
    }
}

class P {
    public static void main(String[] args) {
        Shape a = new Shape(45);
        System.out.println("Length: " + a.length + ", Width: " + a.width + ", Height: " + a.height);
    }
}

class Shape {
    int length;
    int width;
    int height;

    Shape(int length, int width, int height) {
        // --- initialization code...
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class N2 {
    public static void main(String[] args) {
        Shape x = new Shape(100, 50, 70);

        System.out.println(x.length);
        System.out.println(x.width);
        System.out.println(x.height);
    }
}

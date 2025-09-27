class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        // --- initialization code...
        this.length = length;
    }
}

class N {
    public static void main(String[] args) {
        Shape x = new Shape(100);

        System.out.println(x.length);
        System.out.println(x.width);
        System.out.println(x.height);
    }
}

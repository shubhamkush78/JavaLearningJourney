// Student HAS-A Pen

class Student {
    public static void main(String[] args) {
        Pen pen = new Pen();

        pen.write(); // Access Through Instantiation
    }
}

class Pen {
    void write() {
        System.out.println("write.....");
    }
}

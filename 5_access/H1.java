// Student IS-A Pen

class Student extends Pen {
    public static void main(String[] args) {
        Student student = new Student();

        student.write();  // Access Through Inheritance
    }
}

class Pen {
    void write() {
        System.out.println("write write.....");
    }
}
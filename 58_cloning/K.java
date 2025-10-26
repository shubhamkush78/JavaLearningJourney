class Student10 implements Cloneable {
    String name;
    int age;

    Student10() {
        System.out.println("Hello Ji");
    }

    @Override
    public Student10 clone() {
        Student10 obj = null;

        try {
            obj = (Student10)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

class K {
    public static void main(String[] args) {
        Student10 x = new Student10();
        x.name = "prabhu";
        x.age = 23;

        Student10 y = x.clone();

        System.out.println(x);
        System.out.println(y);
    }
}
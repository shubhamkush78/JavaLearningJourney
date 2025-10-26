class Student8 implements Cloneable {
    String name;
    int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class I {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student8 x = new Student8();
        x.name = "prabhu";
        x.age = 23;

        Student8 y = (Student8)x.clone();

        System.out.println(x);
        System.out.println(y);
    }
}
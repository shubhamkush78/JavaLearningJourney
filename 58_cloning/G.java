class Student6 implements Cloneable {
    String name;
    int age;
}

class G extends Student6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        G a = new G();
        a.name = "vidya";
        a.age = 23;

        G b = (G)a.clone();

        System.out.println(a);
        System.out.println(b);
    }
}
class Student9 implements Cloneable {
    String name;
    int age;

    @Override
    public Object clone() /*throws CloneNotSupportedException*/ {
        Object obj = null;

        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

class J {
    public static void main(String[] args) /*throws CloneNotSupportedException*/ {
        Student9 x = new Student9();
        x.name = "prabhu";
        x.age = 23;

        Student9 y = (Student9)x.clone();

        System.out.println(x);
        System.out.println(y);
    }
}
class Student7 implements Cloneable {
    String name;
    int age;

    @Override
    public Object clone() {
        return this.clone();
    }
}

class H {
    public static void main(String[] args) {
        Student7 x = new Student7();
        x.name = "prabhu";
        x.age = 23;

        Student7 y = (Student7)x.clone();
    }
}



// Exception in thread "main" java.lang.StackOverflowError
//         at Student7.clone(H.java:7)
//         at Student7.clone(H.java:7)
//         at Student7.clone(H.java:7)
//         at Student7.clone(H.java:7)
//         at Student7.clone(H.java:7)
//         ...
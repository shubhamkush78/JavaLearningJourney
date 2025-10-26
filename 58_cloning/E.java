class Student4 {
    String name;
    int age;
}

class E extends Student4 {
    public static void main(String[] args) {
        E a = new E();
        a.name = "vidya";
        a.age = 23;

        E b = (E)a.clone();

        System.out.println(a);
        System.out.println(b);
    }
}


// E.java:12: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         E b = (E)a.clone();
//                         ^
// 1 error
class Student5 {
    String name;
    int age;
}

class F extends Student5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        F a = new F();
        a.name = "vidya";
        a.age = 23;

        F b = (F)a.clone();

        System.out.println(a);
        System.out.println(b);
    }
}


// Exception in thread "main" java.lang.CloneNotSupportedException: F
//         at java.base/java.lang.Object.clone(Native Method)
//         at F.main(F.java:12)

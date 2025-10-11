class A {
    public static void main(String[] args) {
        pro("om");
    }

    static void pro(String name, int age) {
        System.out.println(name + " - " + age);
    }
}


// A.java:3: error: method pro in class A cannot be applied to given types;
//         pro("om");
//         ^
//   required: String,int
//   found:    String
//   reason: actual and formal argument lists differ in length
// 1 error
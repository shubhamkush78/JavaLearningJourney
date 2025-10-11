class B {
    public static void main(String[] args) {
        pro("om", 12, 98.67f);
    }

    static void pro(String name, int age) {
        System.out.println(name + " - " + age);
    }
}


// B.java:3: error: method pro in class B cannot be applied to given types;
//         pro("om", 12, 98.67f);
//         ^
//   required: String,int
//   found:    String,int,float
//   reason: actual and formal argument lists differ in length
// 1 error
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = new Pattern();
    }
}


// A.java:5: error: constructor Pattern in class Pattern cannot be applied to given types;
//         Pattern p = new Pattern();
//                     ^
//   required: String,int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
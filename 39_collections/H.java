import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add("56");
        x.add(78);
        x.add(23);
        x.add(true);

        System.out.println(x);
    }    
}


// H.java:8: error: incompatible types: String cannot be converted to Integer
//         x.add("56");
//               ^
// H.java:11: error: incompatible types: boolean cannot be converted to Integer
//         x.add(true);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors

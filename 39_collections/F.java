import java.util.ArrayList;

class F {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(true);
        x.add(56.34);
        x.add(500);

        Boolean y = x.get(1);

        System.out.println(x);
    }
}


// F.java:12: error: incompatible types: Object cannot be converted to Boolean
//         Boolean y = x.get(1);
//                          ^
// Note: F.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error

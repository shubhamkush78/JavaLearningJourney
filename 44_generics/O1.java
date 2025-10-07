import java.util.ArrayList;

class O1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(12);
        a.add(15);

        ArrayList<Float> b = new ArrayList<Float>();

        b.add(2.3f);
        b.add(8.9f);

        pro(a);
        pro(b);
    }

    static void pro(ArrayList<? extends Number> list) {
        System.out.println(list);
        // list.add(5.9f);
        list.add(51);
    }
}


// O1.java:21: error: incompatible types: float cannot be converted to CAP#1
//         list.add(5.9f);
//                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
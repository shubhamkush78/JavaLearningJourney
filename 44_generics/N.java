import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList<Integer> x1 = new ArrayList<Integer>();

        x1.add(12);
        x1.add(45);
        x1.add(9);
        x1.add(34);
        
        ArrayList<Float> x2 = new ArrayList<Float>();

        x2.add(1.2f);
        x2.add(4.5f);
        x2.add(9.f);
        x2.add(.7f);

        ArrayList<String> x3 = new ArrayList<String>();

        x3.add("om");
        x3.add("ram");
        x3.add("golu");
        x3.add("raju");

        pro(x1);
        pro(x2);
        pro(x3);
    }

    static void pro(ArrayList<? extends Number> list) {
        for(Number x : list) {
            System.out.println(x);
        }
    }
}


// N.java:28: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>
//         pro(x3);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
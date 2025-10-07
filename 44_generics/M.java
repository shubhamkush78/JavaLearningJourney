import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList<Integer> x1 = new ArrayList<Integer>();

        x1.add(12);
        x1.add(45);
        x1.add(9);
        
        ArrayList<Float> x2 = new ArrayList<Float>();

        x2.add(1.2f);
        x2.add(4.5f);
        x2.add(9.f);

        pro(x1);
        pro(x2);
    }

    static void pro(ArrayList<Integer> list) {
        for(Integer x : list) {
            System.out.println(x);
        }
    }
}


// M.java:18: error: incompatible types: ArrayList<Float> cannot be converted to ArrayList<Integer>
//         pro(x2);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error

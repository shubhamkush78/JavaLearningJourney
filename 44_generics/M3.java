import java.util.ArrayList;

class M3 {
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

        pro(x1);
        pro(x2);
    }

    static void pro(ArrayList<? extends Number> list) {
        for(Number x : list) {
            System.out.println(x);
        }
    }
}
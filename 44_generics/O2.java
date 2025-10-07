import java.util.ArrayList;

class O2 {
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
        list.set(5.9f);
        list.set(51);
    }
}

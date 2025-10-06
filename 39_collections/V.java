import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(99);
        x.add(2);
        x.add(43);

        for(Integer y : x) {
            System.out.println(y);
        }
    }
}
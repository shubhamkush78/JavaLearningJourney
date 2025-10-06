import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(19);

        System.out.println(x);
        x.add(3, 99);
        System.out.println(x);
    }
}

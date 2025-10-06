import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(5);

        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
    }
}

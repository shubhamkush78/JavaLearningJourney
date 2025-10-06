import java.util.TreeSet;

class Q {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("A ");
        set.add(" a");
        set.add("e ");
        set.add(" J");
        set.add("1 ");
        set.add(" 7");
        set.add(" D");

        System.out.println(set);
    }
}

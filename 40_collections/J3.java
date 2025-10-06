import java.util.HashSet;

class J3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(23);
        set.add(Integer.valueOf(56));
        set.add(12);
        set.add(9);
        set.add(Integer.valueOf(56));
        set.add(41);
        set.add(Integer.valueOf(56));

        System.out.println(set);
    }
}

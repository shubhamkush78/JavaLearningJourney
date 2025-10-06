import java.util.HashSet;

class J2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add(new String("jagtap"));
        set.add("videsh");
        set.add("makhan");
        set.add(new String("jagtap"));
        set.add("daya");

        System.out.println(set);
    }
}

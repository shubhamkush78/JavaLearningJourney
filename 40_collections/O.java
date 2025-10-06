import java.util.HashSet;

class O {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("jagtap");
        set.add("videsh");
        set.add("makhan");
        set.add("daya");

        // String z = new String("videsh");
        String z = new String("vudesh");

        boolean flag = set.remove(z);

        System.out.println(flag);
    }
}

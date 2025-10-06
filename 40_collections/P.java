import java.util.HashSet;

class P {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("jagtap");
        set.add("videsh");
        set.add("makhan");
        set.add("subodh");
        set.add("daya");

        System.out.println(set);

        // for(int i=0;i<set.size();i++) {
            // System.out.println(set.get(i));
        // }

        for(String str : set) {
            System.out.println(str);
        }
    }
}

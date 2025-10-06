import java.util.HashSet;
import java.util.Iterator;

class R {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("mohan");
        set.add("jagtap");
        set.add("makhan");
        set.add("subodh");
        set.add("daya");
        set.add("salunke");

        System.out.println(set);

        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            
            System.out.println(str);
        }
    }
}


// R.java:20: error: incompatible types: Object cannot be converted to String
//             String str = itr.next();
//                                  ^
// 1 error
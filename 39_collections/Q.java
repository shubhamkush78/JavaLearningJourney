import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("rohan");
        list.add(45);   //Q.java:10: error: incompatible types: int cannot be converted to String
        list.add("gohan");
        list.add("tohan");

        System.out.println(list);
        
        String str = list.get(4);  
        System.out.println(str);

        System.out.println(list);
    }
}



// Q.java:16: error: incompatible types: Object cannot be converted to String
//         String str = list.get(4);  // replace
//                              ^
// Note: Q.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error

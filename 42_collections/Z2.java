import java.util.ArrayList;

class Z2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");
        list.add("eohan");

        System.out.println(list);

        String[] x = new String[list.size()];
        String[] arr = list.toArray(x);

        System.out.println(x == arr);

        for(String str : arr) {
            System.out.print(str.toUpperCase() + ", ");
        }
    }
}


// Z2.java:17: error: incompatible types: Object[] cannot be converted to String[]
//         String[] arr = list.toArray(x);
//                                    ^
// Note: Z2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
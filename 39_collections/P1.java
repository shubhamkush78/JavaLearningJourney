import java.util.ArrayList;

class P1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("gohan");
        list.add("tohan");

        System.out.println(list);

        // list.add(2, "golu");  // insert
        String str = list.set(2, "golu");  // replace
        System.out.println(str);

        System.out.println(list);
    }
}

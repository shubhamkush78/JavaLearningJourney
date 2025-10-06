import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("gohan");
        list.add("tohan");

        System.out.println(list);

        list.add(2, "golu");  // insert

        System.out.println(list);
    }
}

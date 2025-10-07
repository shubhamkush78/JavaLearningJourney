import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");

        System.out.println(list);

        Object[] arr = list.toArray();

        // System.out.println(arr);

        for(Object str : arr) {
            System.out.print(((String)str).toUpperCase() + ", ");
        }
    }
}

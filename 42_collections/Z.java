import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("gohan");
        list.add("tohan");
        list.add("eohan");

        System.out.println(list);

        String[] x = new String[0];
        String[] arr = list.toArray(x);

        System.out.println(x == arr);

        for(String str : arr) {
            System.out.print(str.toUpperCase() + ", ");
        }
    }
}

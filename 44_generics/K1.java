import java.util.ArrayList;

class K1 {
    //new code:
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("om");
        x.add("ram");
        x.add("raju");
        x.add("golu");

        //calling the old code...
        pro(x);
    }   
    
    // ArrayList list = new ArrayList<String>();

    //old code ...
    static void pro(ArrayList list) {
        System.out.println(list);
        list.add(12);
        list.add(true);
        System.out.println(list);
    }
}

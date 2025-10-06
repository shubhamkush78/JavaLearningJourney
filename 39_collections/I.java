import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mohan");
        names.add("Rohan");
        names.add("Sohan");
        names.add("Tohan");
        names.add("Gohan");

        // String str = new String("Sohan");
        String str = new String("Vikas");
        boolean flag = names.contains(str);
        System.out.println(flag);

        System.out.println(names);
    }    
}

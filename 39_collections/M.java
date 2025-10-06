import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mohan");
        names.add("Rohan");
        names.add("Sohan");
        names.add("Tohan");
        names.add("Gohan");
        names.add("Sohan");
        
        System.out.println(names);

        String str = new String("Sohan");
        boolean flag = names.remove(str);
        System.out.println(flag);

        System.out.println(names);
    }    
}

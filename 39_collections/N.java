import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Sohan");
        names.add("Mohan");
        names.add("Rohan");
        names.add("Sohan");
        names.add("Tohan");
        names.add("Gohan");
        names.add("Sohan");
        
        System.out.println(names);

        String str = new String("Sohan");
        
        while(names.remove(str));

        System.out.println(names);
    }    
}

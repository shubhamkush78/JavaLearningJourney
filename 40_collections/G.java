import java.util.LinkedList;

class G {
    public static void main(String[] args) {
        //used as a List
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("mohan");
        list.add("rohan");
        list.add("sohan");
        list.add("tohan");
        list.add("gohan");

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

        // System.out.println(list.get(0));
    }    
}

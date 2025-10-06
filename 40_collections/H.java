import java.util.LinkedList;

class H {
    public static void main(String[] args) {
        //used as a Stack
        LinkedList<String> list = new LinkedList<String>();
        System.out.println(list);
        
        // list.add("mohan");
        // list.add("rohan");
        // list.add("sohan");
        // list.add("tohan");
        // list.add("gohan");
        list.push("mohan");
        list.push("rohan");
        list.push("sohan");
        list.push("tohan");
        list.push("gohan");
        
        System.out.println(list);
        // System.out.println(list.remove(0));
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list);
    }    
}

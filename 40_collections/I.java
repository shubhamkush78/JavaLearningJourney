import java.util.LinkedList;

class I {
    public static void main(String[] args) {
        //used as a Queue
        LinkedList<String> list = new LinkedList<String>();
        System.out.println(list);
        
        // list.add("mohan");
        // list.add("rohan");
        // list.add("sohan");
        // list.add("tohan");
        // list.add("gohan");
        // list.push("mohan");
        // list.push("rohan");
        // list.push("sohan");
        // list.push("tohan");
        // list.push("gohan");
        list.offer("mohan");
        list.offer("rohan");
        list.offer("sohan");
        list.offer("tohan");
        list.offer("gohan");
        
        System.out.println(list);
        // System.out.println(list.remove(0));
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        System.out.println(list);
    }    
}

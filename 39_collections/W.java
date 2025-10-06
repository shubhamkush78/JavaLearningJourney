import java.util.ArrayList;
import java.util.Iterator;

class W {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(99);
        x.add(2);
        x.add(120);

        Iterator itr = x.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(true);
        x.add(56.34);
        x.add(500);
        
        Object y = x.get(2);

        System.out.println(y instanceof Double);
        System.out.println(y instanceof Boolean);
    }
}
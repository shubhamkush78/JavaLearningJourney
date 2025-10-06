import java.util.ArrayList;

class F1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(true);
        x.add(56.34);
        x.add(500);

        Boolean y = (Boolean)x.get(1);

        System.out.println(y);
    }
}
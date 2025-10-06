import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x.size());
        System.out.println(x.isEmpty());
        
        x.add(12);
        x.add(59);
        x.add(23);
        x.add(76);

        System.out.println("#############################");
        
        System.out.println(x.size());
        System.out.println(x.isEmpty());
    }
}
import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(23);
        x.add(56);
        x.add(19);
        x.add(2);
        x.add(43);

        for(int i=0;i<x.size();i++) {
            System.out.println(x.get(i));
        }
    }
}
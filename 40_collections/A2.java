import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();
        
        x.add("ganesh");
        x.add("suresh");
        x.add("ramesh");
        x.add("dinesh");
        x.add("mahesh");

        int length = x.size();

        for(int i=0;i<length;i++) {
            System.out.println(x.remove(0));
        }
    }
}
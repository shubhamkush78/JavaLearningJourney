import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(12);
        a.add("om");
        a.add(true);
        
        ArrayList<String> b = new ArrayList<String>();
        b.add(12);
        b.add("om");
        b.add(true);
        
        ArrayList<int[]> c = new ArrayList<int[]>();
        c.add(12);
        c.add("om");
        c.add(true);
        c.add( new int[] {12, 45, 67});
        
        ArrayList<Student> d = new ArrayList<Student>();
        d.add(12);
        d.add("om");
        d.add(true);
        d.add(new Student());
    }
}